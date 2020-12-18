import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { StoryPitch } from '../../story-pitches/story-pitches.component';

import { STORY_PITCH_API_URL } from '../../app.constants';

@Injectable({
  providedIn: 'root'
})
export class StoryPitchService {

  constructor(private http: HttpClient) { }

  getAllStoryPitches() {
    return this.http.get<StoryPitch[]>(`${STORY_PITCH_API_URL}/story-pitch/get`);
  }

  deletePitch(id){
    return this.http.delete(`${STORY_PITCH_API_URL}/story-pitch/delete/${id}`);
  }

  updatePitch( id, pitch){
    return this.http.put(`${STORY_PITCH_API_URL}/editor/edit/${id}`, pitch);
  }

  // createAuthenticationHttpHeader(){
  //   let username = 'user';
  //   let password = 'password';
  //   let authenticationHeader = 'Basic ' + window.btoa(username + ':' + password);
  //   return authenticationHeader;
  // }
}
