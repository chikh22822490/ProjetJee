import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class SalleUiService {

  constructor(private http:HttpClient) { }

  afficherSalles(): Observable<any>{

    return this.http.get("http://127.0.0.1:8080/salle/FindAll");
  }

  modifierSalle(nom:string, capacite:number, id:number){
    let salle={
      nomS:nom,
      capaciteS:capacite
    }
    this.http.put("http://127.0.0.1:8080/salle/updateSa"+id,salle);
  }
}
