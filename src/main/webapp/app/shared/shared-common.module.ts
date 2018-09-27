import { NgModule } from '@angular/core';

import { JiuzhangquanzhankeSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent } from './';

@NgModule({
    imports: [JiuzhangquanzhankeSharedLibsModule],
    declarations: [JhiAlertComponent, JhiAlertErrorComponent],
    exports: [JiuzhangquanzhankeSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent]
})
export class JiuzhangquanzhankeSharedCommonModule {}
