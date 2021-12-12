import { University } from './../university-ui/university.model';
import { UniversityUiService } from './../university-ui/university-ui.service';
import { Component, OnInit, Input } from '@angular/core';
import { Form, NgForm } from '@angular/forms';

@Component({
  selector: 'app-ajout-univ',
  templateUrl: './ajout-univ.component.html',
  styleUrls: ['./ajout-univ.component.css']
})
export class AjoutUnivComponent implements OnInit {


  ajouterUniv(f:NgForm){
    this.unServ.ajouterUniv(f.value.nomU,f.value.adresseU);
    location.reload();
  };
  constructor(private unServ: UniversityUiService) { }

  ngOnInit(): void {
  }

}
