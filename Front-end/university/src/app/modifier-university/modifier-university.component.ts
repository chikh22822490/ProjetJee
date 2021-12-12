import { FormBuilder, NgForm } from '@angular/forms';
import { Component, Input, OnInit } from '@angular/core';
import { UniversityUiService } from '../university-ui/university-ui.service';

@Component({
  selector: 'app-modifier-university',
  templateUrl: './modifier-university.component.html',
  styleUrls: ['./modifier-university.component.css']
})
export class ModifierUniversityComponent implements OnInit {

  @Input()
  univ?: any;
  modifierUniv(){
    this.univService.updateUniv(this.updateForm.value.nomU,this.updateForm.value.adresseU,this.updateForm.value.image,this.univ.codeU);
    location.reload();
  }
  updateForm= this.formBuilder.group({
    nomU: [''],
    adresseU: [''],
    image: ['']
  });
  constructor(private formBuilder: FormBuilder, private univService: UniversityUiService) { }

  ngOnInit(): void {
    console.log(this.univ);
    this.updateForm.patchValue({
      nomU: this.univ.nomU,
      adresseU: this.univ.adresseU,
      image: this.univ.image
    });
  }

}
