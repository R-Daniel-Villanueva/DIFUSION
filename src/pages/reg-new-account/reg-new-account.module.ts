import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { RegNewAccountPage } from './reg-new-account';

@NgModule({
  declarations: [
    RegNewAccountPage,
  ],
  imports: [
    IonicPageModule.forChild(RegNewAccountPage),
  ],
})
export class RegNewAccountPageModule {}
