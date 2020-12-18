import { Component, OnInit } from '@angular/core';
import { AuthenticationService } from '../services/authentication.service';

@Component({
  selector: 'app-home-page',
  templateUrl: './home-page.component.html',
  styleUrls: ['./home-page.component.css']
})
export class HomePageComponent implements OnInit {

  authorUsername = this.service.username;
  editorUsername = this.service.username;
  authorLoggedIn = false;
  editorLoggedIn = true;

  constructor(private service: AuthenticationService) { }

  ngOnInit(): void {
  }

  switchUserRoles(){
    if(this.authorLoggedIn === true){
      this.authorLoggedIn = false;
      this.editorLoggedIn = true;
    } else if (this.editorLoggedIn == true){
      this.authorLoggedIn = true;
      this.editorLoggedIn = false;
    }
  }

}
