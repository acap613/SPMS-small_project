import { TestBed } from '@angular/core/testing';

import { StoryPitchService } from './story-pitch.service';

describe('StoryPitchService', () => {
  let service: StoryPitchService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(StoryPitchService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
