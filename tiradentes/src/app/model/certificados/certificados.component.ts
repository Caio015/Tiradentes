import { Component, OnInit } from '@angular/core';
import { CertificadoServiceService } from 'src/app/shared/service/certificado-service.service';
import { Certificado } from '../certificado';

@Component({
  selector: 'app-certificados',
  templateUrl: './certificados.component.html',
  styleUrls: ['./certificados.component.css']
})
export class CertificadosComponent implements OnInit {

  certificados : Array<Certificado> = new Array;
  displayedColumns = ['id', 'nome', 'data', 'horas', 'atividade', 'status'];

  constructor(private certificadoService : CertificadoServiceService) { }

  ngOnInit(): void {
    this.listar();

  }

  listar(){
    this.certificadoService.getCertificados().subscribe(certificados => this.certificados = certificados)
  }

}
