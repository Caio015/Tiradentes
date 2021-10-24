import { HttpClient, HttpClientModule, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { CertificadoModel } from '../model/cetrificado.model';

@Injectable({
  providedIn: 'root'
})
export class ServiceService {

  apiUrl = "http://localhost8080/certificados;"

  httpOptions = {
    headers : new HttpHeaders({
      'Content-Type': 'application/json'
    })
  }


  constructor(
    private httpClient: HttpClient
  ) { }

  public getCertificados() : Observable<CertificadoModel> {

    return this.httpClient.get<CertificadoModel>(this.apiUrl);

  }
}
