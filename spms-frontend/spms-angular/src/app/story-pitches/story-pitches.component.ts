import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { StoryPitchService } from '../services/data/story-pitch.service';

export class StoryPitch {
  constructor(    
    public book_id: number,    
    public author_id: number,
    public title: string,    
    public completion_date: Date,    
    public word_count: number,
    public completed: string,
    public genre: string,    
    public tag: string,
    public description: string,
    public approved: string,    
    public on_hold: string
  ) {}
}

@Component({
  selector: 'app-story-pitches',
  templateUrl: './story-pitches.component.html',
  styleUrls: ['./story-pitches.component.css']
})
export class StoryPitchesComponent implements OnInit {

  pitches: StoryPitch[];
  message: string;
  constructor(
    // data service and router in here
    private service: StoryPitchService,
    private router: Router
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
    this.router.navigate(['form']);
  }
  
  deletePitch(id){
    console.log(`delete button pressed...Story-pitch with ID ${id} removed`);
    this.service.deletePitch( id).subscribe(
      response => {
        console.log(response);
        this.message = `Story Pitch with ID# ${id} deleted!`;
        this.refreshPitches();
      }
    );
  }

  updatePitch(id){
     console.log(`update button pressed...Story Pitch with ID ${id} updated`);
     this.router.navigate(['form', id]);
  }


}
