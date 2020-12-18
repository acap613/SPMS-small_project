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

  // authenticationService(username, password) {

  //   return this.http.post<any>(`${STORY_PITCH_API_URL}/api/v1/basic-auth`, {
  //     username,
  //     password
  //   }).pipe(
  //     map(
  //       data => {
  //         sessionStorage.setItem(AUTH_USER, username);
  //         sessionStorage.setItem(TOKEN, `Bearer ${data.token}`);

  //         return data;
  //       }
  //     )
  //   );
  //   // console.log('Execute Hello World Bean Service');
  // }
  authenticate(username, password){
    if(this.username === 'user' && password === 'password'){
      sessionStorage.setItem('authenticatedUser', username);
      return true;
    }
    return false;
  }


  authenticationService(username, password){
    return this.http.get(`${STORY_PITCH_API_URL}/api/v1/basicauth`,
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
  
  // isUserLoggedIn(){
  //   const user = sessionStorage.getItem(AUTH_USER);
  //   if(user === null){
  //     console.log('User is NOT logged in')
  //     return false;
  //   } else {
  //     console.log('User IS logged in')
  //     return true;
  //   }
    
  // }

  getUserName(){
    let user = sessionStorage.getItem(AUTH_USER);
    if(user === null){
      return '';
    } else {
      return user;
    }
  }

  // logout() {
  //   sessionStorage.removeItem(AUTH_USER);
  //   this.username=null;
  //   this.password=null;
  // }

  
  getAuthenticatedUser() {
    return sessionStorage.getItem(AUTH_USER);
  }

  getAuthenticatedToken() {
    if (this.getAuthenticatedUser()) {
      return sessionStorage.getItem(TOKEN);
    }

  }


  isUserLoggedIn() {
    const user = sessionStorage.getItem(AUTH_USER);
    return !(user === null);
  }

  logout() {
    sessionStorage.removeItem(AUTH_USER);
    sessionStorage.removeItem(TOKEN);
  }
}

export class AuthenticationBean {
  constructor(public message: string) { }
}
