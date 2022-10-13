// import 'construct-style-sheets-polyfill';

import { getThemeDetails, setThemeStyle } from '@public-ui/core';
import { setMode } from '@stencil/core';
// import { BMF } from '@public-ui/themes';
import { Log } from '../utils/dev.utils';

// ts-prune-ignore-next
export default (): void => {
	Log.info(`
,--. ,--.         ,--. ,--. ,-----.           ,--.
|  .'   /  ,---.  |  | \`--' |  |) /_  ,--.--. \`--'
|  .   '  | .-. | |  | ,--. |  .-.  \\ |  .--' ,--.
|  |\\   \\ | '-' | |  | |  | |  '--' / |  |    |  |
\`--' \`--´  \`---´  \`--' \`--' \`------´  \`--'    \`--'
     - the accessible web component library -
`);

	setMode((elm) => {
		if (elm.shadowRoot instanceof ShadowRoot) {
			setThemeStyle(elm, getThemeDetails(elm));
		}
		return 'default';
	});

	// register([BMF], () => {
	// 	return new Promise((resolve) => resolve());
	// }).catch(() => console.warn);

	import('./devtools')
		.then((devTools) => {
			if (typeof devTools === 'object' && devTools !== null && typeof devTools.initialize === 'function') {
				devTools.initialize();
			}
		})
		.catch((error) => {
			Log.error(error);
		});
};