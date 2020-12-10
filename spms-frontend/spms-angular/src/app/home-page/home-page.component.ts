import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-home-page',
  templateUrl: './home-page.component.html',
  styleUrls: ['./home-page.component.css']
})
export class HomePageComponent implements OnInit {

  authorUsername = 'Author';
  editorUsername = 'Editor';
  authorLoggedIn = false;
  editorLoggedIn = true;

  constructor() { }

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
