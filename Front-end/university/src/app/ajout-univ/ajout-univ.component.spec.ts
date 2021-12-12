import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AjoutUnivComponent } from './ajout-univ.component';

describe('AjoutUnivComponent', () => {
  let component: AjoutUnivComponent;
  let fixture: ComponentFixture<AjoutUnivComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AjoutUnivComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AjoutUnivComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
