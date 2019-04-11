import { Component } from '@angular/core';
import { IonicPage, NavController, NavParams, LoadingController } from 'ionic-angular';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { RegistroUsuarios } from '../../model/usersmodel';
import { UserserviceProvider } from '../../providers/userservice/userservice';
/**
 * Generated class for the RegNewAccountPage page.
 *
 * See https://ionicframework.com/docs/components/#navigation for more info on
 * Ionic pages and navigation.
 */

@IonicPage()
@Component({
  selector: 'page-reg-new-account',
  templateUrl: 'reg-new-account.html',
})
export class RegNewAccountPage {
  createForm:FormGroup;

  constructor(
    public navCtrl: NavController, 
    public navParams: NavParams,
    private fb:FormBuilder,
    private user_provider:UserserviceProvider,
    private loadingControler: LoadingController
  ) {
    
    this.createForm=this.fb.group({
      name:['',Validators.required],
      lastname:['',Validators.required],
      secondname:['',Validators.required],
      username:['',Validators.required],
      password1:['',Validators.required],
      password2:['',Validators.required]
    });
  }

  ionViewDidLoad() {
    console.log('ionViewDidLoad RegNewAccountPage');
  }
  CreateUser(){
    console.log(this.createForm.getRawValue());//iMPRIME EL OBJETO Y TODO LOQ UE VIENE DENTRO DE EL
    let PresentLoading=this.loadingControler.create({
      content:'Espere un momento'
    });    
    
    let acountInfo:RegistroUsuarios=this.createForm.getRawValue();
    this.user_provider
    .createAccountUser(acountInfo)
    .subscribe(()=>{
      console.log('Data');
    },error=>{
      console.log('Error',error);
      PresentLoading.dismiss();
    },()=>{
      console.log('Success');
      PresentLoading.dismiss();
    });
  }

}
