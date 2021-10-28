import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Certificado } from 'src/app/model/certificado';
import { CertificadosComponent } from 'src/app/model/certificados/certificados.component';

@Injectable({
  providedIn: 'root'
})
export class CertificadoServiceService {

  apiUrl = '/api/certificados';


  constructor(private http : HttpClient) {

   }

   getCertificados() : Observable<Certificado[]>{
     return this.http.get<Certificado[]>(this.apiUrl);
    
   }
}
