import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ToolBarComponent } from './tool-bar/tool-bar.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {MatToolbarModule} from '@angular/material/toolbar';
import {MatIconModule} from '@angular/material/icon'
import {MatButtonModule} from '@angular/material/button';
import { UniversityUIComponent } from './university-ui/university-ui.component';
import { SalleUIComponent } from './salle-ui/salle-ui.component';
import { HttpClientModule } from '@angular/common/http';
import { AjoutUnivComponent } from './ajout-univ/ajout-univ.component';
import { FormsModule,ReactiveFormsModule } from '@angular/forms';
import { UnivDetailsComponent } from './univ-details/univ-details.component';
import { ModifierUniversityComponent } from './modifier-university/modifier-university.component';
import { SalleAjoutComponent } from './salle-ajout/salle-ajout.component';
import { SalleModifComponent } from './salle-modif/salle-modif.component';
import { SalleDetailsComponent } from './salle-details/salle-details.component';
import { WelcomeUiComponent } from './welcome-ui/welcome-ui.component';
import { EnseignantComponent } from './enseignant/enseignant.component';

@NgModule({
  declarations: [
    AppComponent,
    ToolBarComponent,
    UniversityUIComponent,
    SalleUIComponent,
    AjoutUnivComponent,
    UnivDetailsComponent,
    ModifierUniversityComponent,
    SalleAjoutComponent,
    SalleModifComponent,
    SalleDetailsComponent,
    WelcomeUiComponent,
    EnseignantComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatToolbarModule,
    MatIconModule,
    MatButtonModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule
    ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
