import { TestBed } from '@angular/core/testing';

import { SalleUiService } from './salle-ui.service';

describe('SalleUiService', () => {
  let service: SalleUiService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(SalleUiService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
