import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { AuthenticationService } from '../services/authentication.service';
@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  isLoggedIn = false;

  constructor(
    private route: ActivatedRoute,
    private router: Router,
    public authenticationService: AuthenticationService) { }

  ngOnInit(): void {
    this.isLoggedIn = this.authenticationService.isUserLoggedIn();
    console.log('menu -->' + this.isLoggedIn)
  }

  handleLogout(){
    console.log('Logging out..')
    this.authenticationService.logout();
  }

}
