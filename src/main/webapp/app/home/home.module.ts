import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { RouterModule } from '@angular/router';

import { JiuzhangquanzhankeSharedModule } from 'app/shared';
import { HOME_ROUTE, HomeComponent } from './';
import { CourseService } from 'app/shared/service/CourseService';

@NgModule({
    imports: [JiuzhangquanzhankeSharedModule, RouterModule.forChild([HOME_ROUTE])],
    declarations: [HomeComponent],
    schemas: [CUSTOM_ELEMENTS_SCHEMA],
    providers: [CourseService]
})
export class JiuzhangquanzhankeHomeModule {}
