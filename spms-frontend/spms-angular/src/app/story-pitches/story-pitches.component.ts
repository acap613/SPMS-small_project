import { Component, OnInit } from '@angular/core';
import { StoryPitchService } from '../services/data/story-pitch.service';

export class StoryPitch {
  constructor(
    // tslint:disable-next-line: variable-name
    public book_id: number,
    // tslint:disable-next-line: variable-name
    public author_id: number,
    public title: string,
    // tslint:disable-next-line: variable-name
    public completion_date: Date,
    // tslint:disable-next-line: variable-name
    public word_count: number,
    public completed: string,
    public genre: string,
    // tslint:disable-next-line: variable-name
    public tag: string,
    public description: string,
    public approved: boolean,
    // tslint:disable-next-line: variable-name
    public on_hold: boolean
  ) {}
}

@Component({
  selector: 'app-story-pitches',
  templateUrl: './story-pitches.component.html',
  styleUrls: ['./story-pitches.component.css']
})
export class StoryPitchesComponent implements OnInit {

  pitches: StoryPitch[];

  constructor(
    // data service and router in here
    private service: StoryPitchService
  ) { }

  ngOnInit(): void {
    this.refreshPitches();
  }
  
  refreshPitches(){
    this.service.getAllStoryPitches().subscribe(
      response => {
        console.log(response);
        this.pitches = response;
      }
    )
  }

  addPitch(){
    console.log('button pressed');
  }

}
