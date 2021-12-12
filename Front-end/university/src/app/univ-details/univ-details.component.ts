import { University } from './../university-ui/university.model';
import { Component, Input, OnInit } from '@angular/core';
import { UniversityUiService } from '../university-ui/university-ui.service';

@Component({
  selector: 'app-univ-details',
  templateUrl: './univ-details.component.html',
  styleUrls: ['./univ-details.component.css']
})
export class UnivDetailsComponent implements OnInit {

  @Input()
  univ?:any;
  university?:any;
  popup: boolean=false;
  departements?:any;
  constructor(private unServ: UniversityUiService) { }

  ngOnInit(): void {
    console.log(this.univ);
    this.unServ.afficherUniversityById(this.univ).subscribe(data=>{
      this.university=data;
      this.departements = data.departements;
      console.log(this.university);
    });
  }

}
