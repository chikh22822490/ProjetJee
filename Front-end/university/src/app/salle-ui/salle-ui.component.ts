import { SalleUiService } from './salle-ui.service';
import { Component, OnInit } from '@angular/core';
import { Salle } from './salle.model';

@Component({
  selector: 'app-salle-ui',
  templateUrl: './salle-ui.component.html',
  styleUrls: ['./salle-ui.component.css']
})
export class SalleUIComponent implements OnInit {

  salles?: any[];
  popup: boolean=false;
  popupDetails: boolean=false;
  popupModif: boolean=false;
  salle?:number;
  salleModif?: Salle;
  constructor(private salleSv: SalleUiService) { }

  ngOnInit(): void {
    this.salleSv.afficherSalles().subscribe(
      data=>{this.salles=data;
        console.log(data);
      }
    )
  }
  salleAjout(){
    this.popup=true;
  }
}
