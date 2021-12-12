import { ComponentFixture, TestBed } from '@angular/core/testing';

import { WelcomeUiComponent } from './welcome-ui.component';

describe('WelcomeUiComponent', () => {
  let component: WelcomeUiComponent;
  let fixture: ComponentFixture<WelcomeUiComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ WelcomeUiComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(WelcomeUiComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
