import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SalleModifComponent } from './salle-modif.component';

describe('SalleModifComponent', () => {
  let component: SalleModifComponent;
  let fixture: ComponentFixture<SalleModifComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SalleModifComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(SalleModifComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
