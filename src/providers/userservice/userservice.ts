import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { RegistroUsuarios } from '../../model/usersmodel';
import { CREATE_USERS, GET_ALLUSERS } from '../../endpoints/endpoints';

/*
  Generated class for the UserserviceProvider provider.

  See https://angular.io/guide/dependency-injection for more info on providers
  and Angular DI.
*/
@Injectable()
export class UserserviceProvider {

  constructor(public http: HttpClient) {
    console.log('Hello UserserviceProvider Provider');
  }

  createAccountUser(account:RegistroUsuarios){
    return this.http.post(CREATE_USERS,account);
  }

  getUsers(){
    return this.http.get(GET_ALLUSERS);
  }
}
