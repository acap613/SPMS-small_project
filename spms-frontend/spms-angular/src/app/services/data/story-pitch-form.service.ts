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
    // console.log('Execute Hello World Bean Service');
  }

  deletePitch(username, id){
    return this.http.delete(`${STORY_PITCH_API_URL}/author/${username}/pitch/${id}`);
  }

  retrievePitch(username, id){
    return this.http.get<StoryPitch>(`${STORY_PITCH_API_URL}/author/${username}/pitch/${id}`);
  }

  updatePitch(username, id, pitch){
    return this.http.put(`${STORY_PITCH_API_URL}/author/${username}/pitch/${id}`, pitch);
  }

  createPitch(pitch){
    return this.http.post(`${STORY_PITCH_API_URL}/story-pitch/add`, pitch);
  }

}
