import { Component, OnInit } from '@angular/core';
import { FormControl, FormBuilder, FormGroup } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { StoryPitchFormService } from '../services/data/story-pitch-form.service';
import { StoryPitch } from '../story-pitches/story-pitches.component';

@Component({
  selector: 'app-story-pitch-form',
  templateUrl: './story-pitch-form.component.html',
  styleUrls: ['./story-pitch-form.component.css']
})
export class StoryPitchFormComponent implements OnInit {

  book_id: number;
  author_id: number;
  title: string;
  date: Date;
  words: number;
  points: number;
  genre: string;
  tag: string;
  desc: string;
  completed: string;
  approved: string;
  on_hold: string;

  pitch: StoryPitch;

  genreForm: FormGroup;
  wordCountForm: FormGroup;

  message = 'Select';
  pointValueSelected = 'No word count selected';
  genreSelected = new FormControl();

  wordCount = [
    { noWords: '--Select Word Count (approx.)---', pointValue: 'please select a valid word count' },
    { noWords: '50,000+', pointValue: 50},
    { noWords: '20,000-49,999', pointValue: 25},
    { noWords: '2,000-19,999', pointValue: 10},
    { noWords: '1,999 or less', pointValue: 5}
  ]

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
    private fb: FormBuilder,
    private service: StoryPitchFormService,
    private route: ActivatedRoute,
    private router: Router
  ) { }

  ngOnInit(): void {
    this.pitch = new StoryPitch(this.book_id, this.author_id, this.title , new Date(), this.words, this.completed, this.genre, '', '',this.approved, this.on_hold);
    this.genreForm = this.fb.group({
      genreSelected: [''],
      genre:['']
    });
    // this.genreForm = new FormGroup({
    //   genreControl: new FormControl()
    // });
    this.wordCountForm = this.fb.group({
      wordCountControl: ['']
    });
    
    // 
  }

  saveStoryPitchForm() {
    console.log("submitting...")
    console.log(this.genre)
    this.service.createPitch(this.pitch).subscribe(
      data => {
        console.log(data);
        this.router.navigate(['list']);
      }
    )
  }

  selectPointsByWordCount(event: any) {
    this.pointValueSelected = event.target.value;
  }

  selectGenre(event: any){
   
    this.genre = event.target.value;
    
    console.log(this.genre);
  }

}
