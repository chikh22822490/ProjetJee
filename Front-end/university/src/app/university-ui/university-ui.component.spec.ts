import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UniversityUIComponent } from './university-ui.component';

describe('UniversityUIComponent', () => {
  let component: UniversityUIComponent;
  let fixture: ComponentFixture<UniversityUIComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ UniversityUIComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(UniversityUIComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
