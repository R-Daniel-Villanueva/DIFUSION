import { BrowserModule } from '@angular/platform-browser';
import { ErrorHandler, NgModule } from '@angular/core';
import { IonicApp, IonicErrorHandler, IonicModule } from 'ionic-angular';
import { SplashScreen } from '@ionic-native/splash-screen';
import { StatusBar } from '@ionic-native/status-bar';

import { MyApp } from './app.component';
import { HomePage } from '../pages/home/home';
import { RegNewAccountPage } from '../pages/reg-new-account/reg-new-account';
import { RecuperationaccountPage } from '../pages/recuperationaccount/recuperationaccount';
import { TrueAccessPage } from '../pages/true-access/true-access';


@NgModule({
  declarations: [
    MyApp,
    HomePage,
    RegNewAccountPage,
    RecuperationaccountPage,
    TrueAccessPage
  ],
  imports: [
    BrowserModule,
    IonicModule.forRoot(MyApp)
  ],
  bootstrap: [IonicApp],
  entryComponents: [
    MyApp,
    HomePage,
    RegNewAccountPage,
    RecuperationaccountPage,
    TrueAccessPage
  ],
  providers: [
    StatusBar,
    SplashScreen,
    {provide: ErrorHandler, useClass: IonicErrorHandler}
  ]
})
export class AppModule {}
