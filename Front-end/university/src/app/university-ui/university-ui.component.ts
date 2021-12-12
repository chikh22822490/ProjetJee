import { University } from './university.model';

import { Component, OnInit } from '@angular/core';
import { UniversityUiService } from './university-ui.service';

@Component({
  selector: 'app-university-ui',
  templateUrl: './university-ui.component.html',
  styleUrls: ['./university-ui.component.css']
})
export class UniversityUIComponent implements OnInit {

  universities?: any[];
  popup: boolean=false;
  popupDetails: boolean=false;
  popupModif: boolean=false;
  unive?: number;
  univModif?: University;
  constructor(private unService: UniversityUiService) { }

  ngOnInit(): void {
    this.unService.afficherUniversity().subscribe(
      data=>{this.universities=data;
    }
    );
  }

  onClick(){
    this.popup=true;
  }

  onClickDetails(university: number){
    this.unive=university;
    this.popupDetails=true;
  }

  deleteUniv(id:number){
    this.unService.deletById(id);
    location.reload();
  }

  modifUniv(uni: University){
    this.univModif=uni;
    this.popupModif=true;
  }
}
