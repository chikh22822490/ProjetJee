import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SalleUIComponent } from './salle-ui.component';

describe('SalleUIComponent', () => {
  let component: SalleUIComponent;
  let fixture: ComponentFixture<SalleUIComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SalleUIComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(SalleUIComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
