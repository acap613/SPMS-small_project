import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Author } from '../../author-creation/author-creation.component';
import { STORY_PITCH_API_URL } from '../../app.constants';

@Injectable({
  providedIn: 'root'
})
export class CreateAuthorService {

  constructor(private http: HttpClient) { }

  getAllAuthors(){
    return this.http.get<Author[]>(`${STORY_PITCH_API_URL}/author/get/all`);
  }

  createAuthor(author){
    console.log('CREATE Author service called!')
    return this.http.post(`${STORY_PITCH_API_URL}/author/add`, author);    
  }

  getAuthorbyId(id){    
    return this.http.get<Author>(`${STORY_PITCH_API_URL}/author/get/${id}`);   
  }

  updateAuthor(id, author){
    return this.http.put(`${STORY_PITCH_API_URL}/author/edit/${id}`, author);
  }

  deleteAuthor(id){
    return this.http.delete(`${STORY_PITCH_API_URL}/author/delete/${id}`);
  }

}
