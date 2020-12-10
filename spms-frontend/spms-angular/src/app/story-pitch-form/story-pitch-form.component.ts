import { Component, OnInit } from '@angular/core';
import { FormControl, FormBuilder, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-story-pitch-form',
  templateUrl: './story-pitch-form.component.html',
  styleUrls: ['./story-pitch-form.component.css']
})
export class StoryPitchFormComponent implements OnInit {

  genreForm: FormGroup;

  genres= [
    {
      name:'Horror'
    }, 
    {
      name: 'Fantasy'
    },
    {
      name: 'Sci-Fi' 
    },
    { 
      name: 'Romance'
    } 
  ]
  constructor(private fb: FormBuilder) { }

  ngOnInit(): void {
    this.genreForm = this.fb.group({
      genreControl: ['']
    });
  }

  onSubmit(){
    alert('Submitted')
  }

}
