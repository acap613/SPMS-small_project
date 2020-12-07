import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { StoryPitchesComponent } from './story-pitches.component';

describe('StoryPitchesComponent', () => {
  let component: StoryPitchesComponent;
  let fixture: ComponentFixture<StoryPitchesComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ StoryPitchesComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(StoryPitchesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
