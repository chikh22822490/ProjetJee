import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UnivDetailsComponent } from './univ-details.component';

describe('UnivDetailsComponent', () => {
  let component: UnivDetailsComponent;
  let fixture: ComponentFixture<UnivDetailsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ UnivDetailsComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(UnivDetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
