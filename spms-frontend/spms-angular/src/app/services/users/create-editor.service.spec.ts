import { TestBed } from '@angular/core/testing';

import { CreateEditorService } from './create-editor.service';

describe('CreateEditorService', () => {
  let service: CreateEditorService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(CreateEditorService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
