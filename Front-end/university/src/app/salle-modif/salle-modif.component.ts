import { Salle } from './../salle-ui/salle.model';
import { SalleUiService } from './../salle-ui/salle-ui.service';
import { Component, Input, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';

@Component({
  selector: 'app-salle-modif',
  templateUrl: './salle-modif.component.html',
  styleUrls: ['./salle-modif.component.css']
})
export class SalleModifComponent implements OnInit {

  @Input()
  salle?: any;
  popup: boolean=false;
  popupDetails: boolean=false;
  popupModif: boolean=false;
  salleId?:number;
  salleModif?:Salle;
  modifierSalle(){
    this.salleSr.modifierSalle(this.updateForm.value.nomS,this.updateForm.value.capaciteS,this.salle.codeU);
    location.reload();
  }
  updateForm= this.formBuilder.group({
    nomS: [''],
    capaciteS: ['']
  });
  constructor(private formBuilder: FormBuilder, private salleSr: SalleUiService) { }

  ngOnInit(): void {
    console.log(this.salle);
    this.updateForm.patchValue({
      nomU: this.salle.nomS,
      adresseU: this.salle.capciteS
    });
  }

  salleModifier(){
    this.popupModif=true;
  }
}
