import { TestBed } from '@angular/core/testing';

import { StoryPitchFormService } from './story-pitch-form.service';

describe('StoryPitchFormService', () => {
  let service: StoryPitchFormService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(StoryPitchFormService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
