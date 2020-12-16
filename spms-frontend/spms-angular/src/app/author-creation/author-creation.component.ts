import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { CreateAuthorService } from '../services/users/create-author.service';

export class Author {
  constructor(
    public id: number,  
    public first_name: string,
    public last_name: string,
    public current_points: number,
    public points_allowed: number,    
    public username: string,
    public password: string    
  ){}
 
}


@Component({
  selector: 'app-author-creation',
  templateUrl: './author-creation.component.html',
  styleUrls: ['./author-creation.component.css']
})
export class AuthorCreationComponent implements OnInit {

  author_id: number;  
  current_points: number;
  points_allowed: number;
  first_name: string;
  last_name: string;   
  username: string;
  password: string;

  author: Author;    

  message = 'Select';
  pointValueSelected = 'No word count selected'; 

  genres= [
    { name: 'Action/Adventure', value: 'adventure', tableId: 11 },
    { name: 'Autobiography', value: 'autobiography', tableId: 1},
    { name: 'Biography', value: 'biography', tableId: 2 },
    { name: 'Comic/Graphic Novel', value: 'manga', tableId: 9},
    { name: 'Essay', value: 'fantsay', tableId: 3 }, 
    { name: 'Fantasy', value: 'fantsay', tableId: 3 }, 
    { name: 'History', value: 'history', tableId: 10 },
    { name:'Horror', value: 'horror', tableId: 5 }, 
    { name: 'Literary Fiction/Drama', value: 'drama', tableId: 7 },
    { name: 'Mystery', value: 'mystery', tableId: 6 },
    { name: 'Romance', value: 'romance', tableId: 8 },      
    { name: 'Science Fiction', value: 'sci-fi', tableId: 4 }
    
  ]
  constructor(    
    
    private service: CreateAuthorService,
    private route: ActivatedRoute,
    private router: Router
  ) { }

  ngOnInit(): void {  

    this.author = new Author(this.author_id, this.first_name , this.last_name, 100, 100, this.username, this.password);
    
  }

  saveAuthorCreationForm() {
   console.log('submitting...')
   this.service.createAuthor(this.author).subscribe(
    data => {
      console.log(data);
      this.router.navigate(['list']);
    }
  );
  //  if(this.author_id == -1){
  //     this.service.createAuthor(this.author).subscribe(
  //       data => {
  //         console.log(data);
  //         this.router.navigate(['list']);
  //       }
  //     );
  //   } else {
  //     this.service.updateAuthor(this.author_id, this.author)
  //   }   
  } 

  
  
}


export class Editor {
  constructor(
    public editor_id: number,  
    public first_name: string,
    public last_name: string,
    public points_allowed: number,  
    public is_assistant: string,
    public is_senior: string,
    public is_general: string,
    public username: string,
    public password: string,
    public editor_genre: string[]
  ) {}
}
