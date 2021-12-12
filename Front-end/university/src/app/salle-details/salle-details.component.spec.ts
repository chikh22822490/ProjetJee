import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SalleDetailsComponent } from './salle-details.component';

describe('SalleDetailsComponent', () => {
  let component: SalleDetailsComponent;
  let fixture: ComponentFixture<SalleDetailsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SalleDetailsComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(SalleDetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
