import { SalleUiService } from './../salle-ui/salle-ui.service';
import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-salle-ajout',
  templateUrl: './salle-ajout.component.html',
  styleUrls: ['./salle-ajout.component.css']
})
export class SalleAjoutComponent implements OnInit {

  ajouterUniv(f:NgForm){
    this.salleSr.afficherSalles();
    location.reload();
  };
  constructor(private salleSr: SalleUiService) { }

  ngOnInit(): void {
  }

}
