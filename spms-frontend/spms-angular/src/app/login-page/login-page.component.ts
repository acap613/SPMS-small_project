import { ConstantPool } from '@angular/compiler';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { AuthenticationService } from '../services/authentication.service';


@Component({
  selector: 'app-login-page',
  templateUrl: './login-page.component.html',
  styleUrls: ['./login-page.component.css']
})
export class LoginPageComponent implements OnInit {

  username: string;
  password: string;
  errorMessage = 'Invalid Credentials';
  loginSuccessMessage: string;
  invalidLogin = false;
  loginSuccess = false;

  constructor(
    private router: Router,
    private route: ActivatedRoute,
    private authService: AuthenticationService) { }

  ngOnInit(): void {
  }

  handleLogin() {
    this.authService.authenticationService(this.username, this.password)
      .subscribe( 
        data => {
          console.log(data);
          this.invalidLogin = false;
          this.loginSuccess = true;
          this.loginSuccessMessage = 'Login Successful.';
          this.router.navigate(['/home']);
        }, 
    //() => {
      //this.invalidLogin = true;
      //this.loginSuccess = false;
      error =>{
        console.log(error);
        this.invalidLogin = true;

    });      
  }

  handleAuthLogin() {
    this.authService.authenticationService(this.username, this.password)
      .subscribe( 
        data => {
          console.log(data);
          this.invalidLogin = false;
          this.loginSuccess = true;
          this.loginSuccessMessage = 'Login Successful.';
          this.router.navigate(['/home']);
        }, 
    //() => {
      //this.invalidLogin = true;
      //this.loginSuccess = false;
      error =>{
        console.log(error);
        this.invalidLogin = true;

    });      
  }

}
