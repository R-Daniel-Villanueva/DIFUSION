import { Component } from '@angular/core';
import { NavController } from 'ionic-angular';
import { RegNewAccountPage } from '../reg-new-account/reg-new-account';
import { RecuperationaccountPage } from '../recuperationaccount/recuperationaccount';
import { TrueAccessPage } from '../true-access/true-access';

@Component({
  selector: 'page-home',
  templateUrl: 'home.html'
})
export class HomePage {

  constructor(public navCtrl: NavController) {

  }
  goRecuperar(){
    this.navCtrl.push(RecuperationaccountPage);
    console.log("fuimonos");
  }
  goCrear(){
    this.navCtrl.push(RegNewAccountPage);
    console.log("fuimonos");
  }
  goTrueAccess(){
    this.navCtrl.push(TrueAccessPage);
    console.log("fuimonos");
  }

}
