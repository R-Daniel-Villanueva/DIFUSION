import { Component } from '@angular/core';
import { IonicPage, NavController, NavParams, ModalController } from 'ionic-angular';
import { HomePage } from '../home/home';
import { MysitePage } from '../mysite/mysite';
import { ServiciosPage } from '../servicios/servicios';
import { SettingsPage } from '../settings/settings';

/**
 * Generated class for the TrueAccessPage page.
 *
 * See https://ionicframework.com/docs/components/#navigation for more info on
 * Ionic pages and navigation.
 */

@IonicPage()
@Component({
  selector: 'page-true-access',
  templateUrl: 'true-access.html',
})
export class TrueAccessPage {

  constructor(
    public navCtrl: NavController, 
    public navParams: NavParams,public modalCtrl: ModalController) {
      
  }

  ionViewDidLoad() {
    console.log('ionViewDidLoad TrueAccessPage');
  }

  logOut(){
    this.navCtrl.setRoot(HomePage);
  }
  goHome(){
    //this.navCtrl.push(TrueAccessPage);
  }
  goServices(){
    this.navCtrl.push(ServiciosPage);
  }
  goMySite(){
    this.navCtrl.push(MysitePage);
  }
  goSettings(){
    this.navCtrl.push(SettingsPage);
  }
}
