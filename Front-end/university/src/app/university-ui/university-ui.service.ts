import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UniversityUiService {

  constructor(private http:HttpClient) { }

  afficherUniversity(): Observable<any>{

    return this.http.get("http://127.0.0.1:8080/university/FindAll");
  }

  ajouterUniv(nom: string, adresse:string){
    let univ={
      nomU:nom,
      adresseU:adresse
    }
    this.http.post("http://127.0.0.1:8080/university/AddUn",univ).subscribe();
  }

  afficherUniversityById(id:number): Observable<any>{
    return this.http.get("http://127.0.0.1:8080/university/FindUnId/"+id);
  }

  deletById(id:number){
    this.http.delete("http://127.0.0.1:8080/university/DeleteUnId/"+id).subscribe();
  }

  updateUniv(nom: string, adresse:string, image: string,id:number){
    let univ={
      nomU:nom,
      adresseU:adresse,
      image:image
    }
    this.http.put("http://127.0.0.1:8080/university/updateUn/"+id,univ).subscribe();
  }
}
