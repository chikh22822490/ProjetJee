import { EnseignantComponent } from './enseignant/enseignant.component';
import { WelcomeUiComponent } from './welcome-ui/welcome-ui.component';
import { SalleUIComponent } from './salle-ui/salle-ui.component';
import { AjoutUnivComponent } from './ajout-univ/ajout-univ.component';
import { UniversityUIComponent } from './university-ui/university-ui.component';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AppComponent } from './app.component';

const routes: Routes = [
  {
    component: WelcomeUiComponent,
    path: ''
  },
  {
    component: UniversityUIComponent,
    path: 'university'
  },

  {
    component: AjoutUnivComponent,
    path: 'ajoutUniv'
  },
  {
    component: SalleUIComponent,
    path: 'salle'
  },
  {
    component: EnseignantComponent,
    path: 'enseignant'
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
