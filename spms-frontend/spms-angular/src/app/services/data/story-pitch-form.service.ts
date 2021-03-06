import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { StoryPitch } from 'src/app/story-pitches/story-pitches.component';
import { STORY_PITCH_API_URL } from '../../app.constants';

@Injectable({
  providedIn: 'root'
})
export class StoryPitchFormService {

  constructor(private http: HttpClient) { }

  retrieveAllPitches(username){
    return this.http.get<StoryPitch[]>(`${STORY_PITCH_API_URL}/author/${username}/pitch`);
    
  }

  deletePitch(id){
    return this.http.delete(`${STORY_PITCH_API_URL}/story-pitch/delete/${id}`);
  }

  retrievePitch(username, id){
    return this.http.get<StoryPitch>(`${STORY_PITCH_API_URL}/author/${username}/pitch/${id}`);
  }

  updatePitch(author_id, book_id, pitch){
    return this.http.put(`${STORY_PITCH_API_URL}/author/${author_id}/edit/${book_id}`, pitch);
  } 

  createPitch(pitch){
    console.log("Creating new pitch...")
    return this.http.post(`${STORY_PITCH_API_URL}/story-pitch/add`, pitch);
  }

  // createHttpHeader(){
  //   let username = 'user';
  //   let password = 'password';
  //   let authHeaderString = 'Basic ' + window.btoa(username + ':' +  password);

  //   return authHeaderString;
  // }

}
