package com.example.adapters;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;

import java.util.Optional;

/**
 * Der Input-Typ **Range** erzeugt ein interaktives Element, mit dem Werte durch Verschieben eines Reglers verändert werden können.
 */

@Tag("kol-input-range")
@NpmPackage(value = "@public-ui/components", version = "1.6.0-rc.25")
@JsModule("@public-ui/components/dist/components/kol-input-range")
public class KolInputRange extends Component {
	/**
	 * Gibt an, mit welcher Tastenkombination man das interaktive Element der Komponente auslösen oder fokussieren kann.
	 *
	 * @param value String
	 */
	public void setAccessKey(final String value) {
		getElement().setProperty("_access-key", value.toString());
	}

	/**
	 * Gibt an, mit welcher Tastenkombination man das interaktive Element der Komponente auslösen oder fokussieren kann.
	 *
	 * @return Optional<String>
	 */
	public Optional<String> getAccessKey() {
		var value = getElement().getProperty("_access-key", null);
		return value.isEmpty() ? Optional.empty() : Optional.of(value);
	}

	/**
	 * Gibt an, ob der Screenreader die Meldung aktiv vorlesen soll.
	 *
	 * @param value String
	 */
	public void setAlert(final String value) {
		getElement().setProperty("_alert", value.toString());
	}

	/**
	 * Gibt an, ob der Screenreader die Meldung aktiv vorlesen soll.
	 *
	 * @return Optional<String>
	 */
	public Optional<String> getAlert() {
		var value = getElement().getProperty("_alert", null);
		return value.isEmpty() ? Optional.empty() : Optional.of(value);
	}

	/**
	 * Gibt an, ob das Eingabefeld autovervollständigt werden kann.
	 *
	 * @param value String
	 */
	public void setAutoComplete(final String value) {
		getElement().setProperty("_auto-complete", value.toString());
	}

	/**
	 * Gibt an, ob das Eingabefeld autovervollständigt werden kann.
	 *
	 * @return Optional<String>
	 */
	public Optional<String> getAutoComplete() {
		var value = getElement().getProperty("_auto-complete", null);
		return value.isEmpty() ? Optional.empty() : Optional.of(value);
	}

	/**
	 * Makes the element not focusable and ignore all events.
TODO: Change type back to `DisabledPropType` after Stencil#4663 has been resolved
	 *
	 * @param value String
	 */
	public void setDisabled(final String value) {
		getElement().setProperty("_disabled", value.toString());
	}

	/**
	 * Makes the element not focusable and ignore all events.
TODO: Change type back to `DisabledPropType` after Stencil#4663 has been resolved
	 *
	 * @return Optional<String>
	 */
	public Optional<String> getDisabled() {
		var value = getElement().getProperty("_disabled", null);
		return value.isEmpty() ? Optional.empty() : Optional.of(value);
	}

	/**
	 * Gibt den Text für eine Fehlermeldung an.
	 *
	 * @param value String
	 */
	public void setError(final String value) {
		getElement().setProperty("_error", value.toString());
	}

	/**
	 * Gibt den Text für eine Fehlermeldung an.
	 *
	 * @return Optional<String>
	 */
	public Optional<String> getError() {
		var value = getElement().getProperty("_error", null);
		return value.isEmpty() ? Optional.empty() : Optional.of(value);
	}

	/**
	 * Tells the element to hide the label.
TODO: Change type back to `HideLabelPropType` after Stencil#4663 has been resolved.
	 *
	 * @param value String
	 */
	public void setHideLabel(final String value) {
		getElement().setProperty("_hide-label", value.toString());
	}

	/**
	 * Tells the element to hide the label.
TODO: Change type back to `HideLabelPropType` after Stencil#4663 has been resolved.
	 *
	 * @return Optional<String>
	 */
	public Optional<String> getHideLabel() {
		var value = getElement().getProperty("_hide-label", null);
		return value.isEmpty() ? Optional.empty() : Optional.of(value);
	}

	/**
	 * Gibt den Hinweistext an.
	 *
	 * @param value String
	 */
	public void setHint(final String value) {
		getElement().setProperty("_hint", value.toString());
	}

	/**
	 * Gibt den Hinweistext an.
	 *
	 * @return Optional<String>
	 */
	public Optional<String> getHint() {
		var value = getElement().getProperty("_hint", null);
		return value.isEmpty() ? Optional.empty() : Optional.of(value);
	}

	/**
	 * Setzt die Iconklasse (z.B.: `_icon="codicon codicon-home`).
	 *
	 * @param value String
	 */
	public void setIcon(final String value) {
		getElement().setProperty("_icon", value.toString());
	}

	/**
	 * Setzt die Iconklasse (z.B.: `_icon="codicon codicon-home`).
	 *
	 * @return Optional<String>
	 */
	public Optional<String> getIcon() {
		var value = getElement().getProperty("_icon", null);
		return value.isEmpty() ? Optional.empty() : Optional.of(value);
	}

	/**
	 * Defines the internal ID of the primary component element.
	 *
	 * @param value String
	 */
	public void setId(final String value) {
		getElement().setProperty("_id", value.toString());
	}

	/**
	 * Defines the internal ID of the primary component element.
	 *
	 * @return Optional<String>
	 */
	public Optional<String> getId() {
		var value = getElement().getProperty("_id", null);
		return value.isEmpty() ? Optional.empty() : Optional.of(value);
	}

	/**
	 * Setzt die sichtbare oder semantische Beschriftung der Komponente (z.B. Aria-Label, Label, Headline, Caption, Summary usw.).
	 *
	 * @param value String
	 */
	public void setLabel(final String value) {
		getElement().setProperty("_label", value.toString());
	}

	/**
	 * Setzt die sichtbare oder semantische Beschriftung der Komponente (z.B. Aria-Label, Label, Headline, Caption, Summary usw.).
	 *
	 * @return Optional<String>
	 */
	public Optional<String> getLabel() {
		var value = getElement().getProperty("_label", null);
		return value.isEmpty() ? Optional.empty() : Optional.of(value);
	}

	/**
	 * Gibt die Liste der Vorschlagswörter an.
	 *
	 * @param value String
	 */
	public void setList(final String value) {
		getElement().setProperty("_list", value.toString());
	}

	/**
	 * Gibt die Liste der Vorschlagswörter an.
	 *
	 * @return Optional<String>
	 */
	public Optional<String> getList() {
		var value = getElement().getProperty("_list", null);
		return value.isEmpty() ? Optional.empty() : Optional.of(value);
	}

	/**
	 * Gibt den größtmöglichen Eingabewert an.
	 *
	 * @param value String
	 */
	public void setMax(final String value) {
		getElement().setProperty("_max", value.toString());
	}

	/**
	 * Gibt den größtmöglichen Eingabewert an.
	 *
	 * @return Optional<String>
	 */
	public Optional<String> getMax() {
		var value = getElement().getProperty("_max", null);
		return value.isEmpty() ? Optional.empty() : Optional.of(value);
	}

	/**
	 * Gibt den kleinstmöglichen Eingabewert an.
	 *
	 * @param value String
	 */
	public void setMin(final String value) {
		getElement().setProperty("_min", value.toString());
	}

	/**
	 * Gibt den kleinstmöglichen Eingabewert an.
	 *
	 * @return Optional<String>
	 */
	public Optional<String> getMin() {
		var value = getElement().getProperty("_min", null);
		return value.isEmpty() ? Optional.empty() : Optional.of(value);
	}

	/**
	 * Defines the technical name of an input field.
	 *
	 * @param value String
	 */
	public void setName(final String value) {
		getElement().setProperty("_name", value.toString());
	}

	/**
	 * Defines the technical name of an input field.
	 *
	 * @return Optional<String>
	 */
	public Optional<String> getName() {
		var value = getElement().getProperty("_name", null);
		return value.isEmpty() ? Optional.empty() : Optional.of(value);
	}

	/**
	 * Gibt die Schrittweite der Wertveränderung an.
	 *
	 * @param value String
	 */
	public void setStep(final String value) {
		getElement().setProperty("_step", value.toString());
	}

	/**
	 * Gibt die Schrittweite der Wertveränderung an.
	 *
	 * @return Optional<String>
	 */
	public Optional<String> getStep() {
		var value = getElement().getProperty("_step", null);
		return value.isEmpty() ? Optional.empty() : Optional.of(value);
	}

	/**
	 * Suggestions to provide for the input.
	 *
	 * @param value String
	 */
	public void setSuggestions(final String value) {
		getElement().setProperty("_suggestions", value.toString());
	}

	/**
	 * Suggestions to provide for the input.
	 *
	 * @return Optional<String>
	 */
	public Optional<String> getSuggestions() {
		var value = getElement().getProperty("_suggestions", null);
		return value.isEmpty() ? Optional.empty() : Optional.of(value);
	}

	/**
	 * Gibt an, welchen Tab-Index das primäre Element in der Komponente hat. (https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/tabindex)
	 *
	 * @param value String
	 */
	public void setTabIndex(final String value) {
		getElement().setProperty("_tab-index", value.toString());
	}

	/**
	 * Gibt an, welchen Tab-Index das primäre Element in der Komponente hat. (https://developer.mozilla.org/en-US/docs/Web/HTML/Global_attributes/tabindex)
	 *
	 * @return Optional<String>
	 */
	public Optional<String> getTabIndex() {
		var value = getElement().getProperty("_tab-index", null);
		return value.isEmpty() ? Optional.empty() : Optional.of(value);
	}

	/**
	 * Defines where to show the Tooltip preferably: top, right, bottom or left.
	 *
	 * @param value String
	 */
	public void setTooltipAlign(final String value) {
		getElement().setProperty("_tooltip-align", value.toString());
	}

	/**
	 * Defines where to show the Tooltip preferably: top, right, bottom or left.
	 *
	 * @return Optional<String>
	 */
	public Optional<String> getTooltipAlign() {
		var value = getElement().getProperty("_tooltip-align", null);
		return value.isEmpty() ? Optional.empty() : Optional.of(value);
	}

	/**
	 * Shows if the input was touched by a user.
TODO: Change type back to `TouchedPropType` after Stencil#4663 has been resolved
	 *
	 * @param value String
	 */
	public void setTouched(final String value) {
		getElement().setProperty("_touched", value.toString());
	}

	/**
	 * Shows if the input was touched by a user.
TODO: Change type back to `TouchedPropType` after Stencil#4663 has been resolved
	 *
	 * @return Optional<String>
	 */
	public Optional<String> getTouched() {
		var value = getElement().getProperty("_touched", null);
		return value.isEmpty() ? Optional.empty() : Optional.of(value);
	}

	/**
	 * Gibt den Wert des Eingabefeldes an.
	 *
	 * @param value String
	 */
	public void setValue(final String value) {
		getElement().setProperty("_value", value.toString());
	}

	/**
	 * Gibt den Wert des Eingabefeldes an.
	 *
	 * @return Optional<String>
	 */
	public Optional<String> getValue() {
		var value = getElement().getProperty("_value", null);
		return value.isEmpty() ? Optional.empty() : Optional.of(value);
	}
}
