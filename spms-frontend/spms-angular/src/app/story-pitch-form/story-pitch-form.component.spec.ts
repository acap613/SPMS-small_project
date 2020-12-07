import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { StoryPitchFormComponent } from './story-pitch-form.component';

describe('StoryPitchFormComponent', () => {
  let component: StoryPitchFormComponent;
  let fixture: ComponentFixture<StoryPitchFormComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ StoryPitchFormComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(StoryPitchFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
