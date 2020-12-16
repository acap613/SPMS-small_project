import { TestBed } from '@angular/core/testing';

import { CreateAuthorService } from './create-author.service';

describe('CreateAuthorService', () => {
  let service: CreateAuthorService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(CreateAuthorService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
