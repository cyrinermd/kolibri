import { Component, h, JSX, Prop, State, Watch } from '@stencil/core';

import { Generic } from '@public-ui/core';
import { devHint, featureHint } from '../../utils/a11y.tipps';
import { watchBoolean, watchString, watchValidator } from '../../utils/prop.validators';
import { watchIcofont } from '../icon-icofont/validation';
import { Alignment } from '../../types/icon';
import { createContrastColorPair, KoliBriContrastColor } from './contrast';
import { Nationalfarben } from '../../enums/color';
import { Icofont } from '../../types/icofont';

featureHint(`[KolBadge] Optimierung des _color-Properties (rgba, rgb, hex usw.).`);

const HACK_REG_EX = /^([a-f0-9]{3}|[a-f0-9]{6})$/;

export type KoliBriColor = {
	backgroundColor: string;
	color: string;
};

/**
 * API
 */
type RequiredProps = {
	label: string;
};
type OptionalProps = {
	color: string | KoliBriColor;
	icon: Icofont;
	iconAlign: Alignment;
	iconOnly: boolean;
};
export type Props = Generic.Element.Members<RequiredProps, OptionalProps>;

type RequiredStates = {
	color: string | KoliBriColor;
	label: string;
};
type OptionalStates = {
	icon: Icofont;
	iconAlign: Alignment;
	iconOnly: boolean;
};
type States = Generic.Element.Members<RequiredStates, OptionalStates>;

@Component({
	tag: 'kol-badge',
	styleUrls: {
		default: './style.sass',
	},
	shadow: true,
})
export class KolBadge implements Generic.Element.ComponentApi<RequiredProps, OptionalProps, RequiredStates, OptionalStates> {
	private bgColorStr = '#000';
	private colorStr = '#fff';

	public render(): JSX.Element {
		return (
			<span
				style={{
					backgroundColor: this.bgColorStr,
					color: this.colorStr,
				}}
			>
				{typeof this.state._icon === 'string' && this.state._iconAlign === 'left' && (
					<kol-icon-icofont
						class={{
							'mr-1': this.state._iconOnly === false,
						}}
						style={{
							color: this.colorStr,
						}}
						_ariaLabel={this.state._iconOnly === true ? this.state._label : ''}
						_icon={this.state._icon}
					/>
				)}
				{this.state._iconOnly !== true && this.state._label}
				{typeof this.state._icon === 'string' && this.state._iconAlign === 'right' && (
					<kol-icon-icofont
						class={{
							'ml-1': this.state._iconOnly === false,
						}}
						style={{
							color: this.colorStr,
						}}
						_ariaLabel={this.state._iconOnly === true ? this.state._label : ''}
						_icon={this.state._icon}
					/>
				)}
			</span>
		);
	}

	/**
	 * Gibt die Farbe des Hintergrundes bzw. der Schrift an.
	 */
	@Prop() public _color?: string | KoliBriColor = Nationalfarben.Schwarz;

	/**
	 * Gibt einen Identifier eines Icons aus den Icofont's an. (https://icofont.com/)
	 */
	@Prop() public _icon?: Icofont;

	/**
	 * Gibt an, ob das Icon entweder links oder rechts dargestellt werden soll.
	 */
	@Prop() public _iconAlign?: Alignment = 'left';

	/**
	 * Gibt an, ob nur das Icon angezeigt wird.
	 */
	@Prop() public _iconOnly?: boolean = false;

	/**
	 * Gibt den Label-Text des Badges an.
	 */
	@Prop() public _label!: string;

	/**
	 * @see: components/abbr/component.tsx (@State)
	 */
	@State() public state: States = {
		_color: Nationalfarben.Schwarz,
		_label: '',
	};

	private handleColorChange = (value: unknown) => {
		let color = value as string | KoliBriColor;
		let colorPair: KoliBriContrastColor;
		if (typeof color === 'string') {
			if (HACK_REG_EX.test(color)) {
				// Catch Breaking Change - remove next Major
				devHint(
					`[KolBadge] Bitte verwenden Sie zukünftig nur noch das Standard-Farbformat für CSS (https://developer.mozilla.org/en-US/docs/Web/CSS/color_value).`
				);
				color = `#${color}`;
			}
			colorPair = createContrastColorPair(color);
		} else {
			colorPair = createContrastColorPair({
				baseColor: color.backgroundColor,
				contrastColor: color.color,
			});
		}
		this.bgColorStr = colorPair.baseColor;
		this.colorStr = colorPair.contrastColor;
	};

	/**
	 * @see: components/abbr/component.tsx (@Watch)
	 */
	@Watch('_color')
	public validateColor(value?: string | KoliBriColor): void {
		watchValidator(
			this,
			'_color',
			(value) => typeof value === 'string' || (typeof value === 'object' && value !== null),
			new Set(['string', 'KoliBriColor']),
			value,
			{
				defaultValue: Nationalfarben.Schwarz,
				hooks: {
					beforePatch: this.handleColorChange,
				},
			}
		);
	}

	/**
	 * @see: components/abbr/component.tsx (@Watch)
	 */
	@Watch('_icon')
	public validateIcon(value?: Icofont): void {
		watchIcofont(this, value);
	}

	/**
	 * @see: components/abbr/component.tsx (@Watch)
	 */
	@Watch('_iconAlign')
	public validateIconAlign(value?: Alignment): void {
		// Werte prüfen
		if (typeof value === 'string') {
			this.state = {
				...this.state,
				_iconAlign: value,
			};
		}
	}

	/**
	 * @see: components/abbr/component.tsx (@Watch)
	 */
	@Watch('_iconOnly')
	public validateIconOnly(value?: boolean): void {
		watchBoolean(this, '_iconOnly', value);
	}

	/**
	 * @see: components/abbr/component.tsx (@Watch)
	 */
	@Watch('_label')
	public validateLabel(value?: string): void {
		watchString(this, '_label', value, {
			required: true,
		});
	}

	/**
	 * @see: components/abbr/component.tsx (componentWillLoad)
	 */
	public componentWillLoad(): void {
		this.validateColor(this._color);
		this.validateIcon(this._icon);
		this.validateIconAlign(this._iconAlign);
		this.validateIconOnly(this._iconOnly);
		this.validateLabel(this._label);
	}
}