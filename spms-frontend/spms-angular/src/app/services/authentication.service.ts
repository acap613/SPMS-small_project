import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { map } from 'rxjs/operators';
import { STORY_PITCH_API_URL } from '../app.constants';
import { AUTH_USER } from '../app.constants';
import { TOKEN } from '../app.constants';

@Injectable({
  providedIn: 'root'
})
export class AuthenticationService {

  public username: string;
  public password: string;

  constructor(private http: HttpClient) { }

  authenticationService(username, password){
    return this.http.get(`${STORY_PITCH_API_URL}/api/v1/basic-auth`,
     { headers: {authorization: this.createToken(username, password) } }).pipe(
      map(
        data => {
          this.username=username;
          this.password=password;
          this.registerLogin(username, password);
          return data;
        }
      )
    )
  }

  createToken(username, password){
    return 'Basic ' + window.btoa(username + ':' + password);
  }

  registerLogin(username, password){
    sessionStorage.setItem(AUTH_USER, username)
  }
  
  isUserLoggedIn(){
    let user = sessionStorage.getItem(AUTH_USER);
    if(user === null){
      console.log('User is NOT logged in')
      return false;
    } 
      console.log('User IS logged in')

      return true;
    
  }

  getUserName(){
    let user = sessionStorage.getItem(AUTH_USER);
    if(user === null){
      return '';
    } else {
      return user;
    }
  }

  logout() {
    sessionStorage.removeItem(AUTH_USER);
    this.username=null;
    this.password=null;
  }
}

export class AuthenticationBean {
  constructor(public message: string) { }
}
