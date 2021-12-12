import { TestBed } from '@angular/core/testing';

import { UniversityUiService } from './university-ui.service';

describe('UniversityUiService', () => {
  let service: UniversityUiService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(UniversityUiService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
