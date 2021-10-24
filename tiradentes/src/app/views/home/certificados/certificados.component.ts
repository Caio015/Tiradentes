import { Component, OnInit } from '@angular/core';
import { CertificadoModel } from 'src/app/shared/model/cetrificado.model';
import { ServiceService } from 'src/app/shared/service/certificadoService.service';

@Component({
  selector: 'app-certificados',
  templateUrl: './certificados.component.html',
  styleUrls: ['./certificados.component.css']
})
export class CertificadosComponent implements OnInit {

    certificados : CertificadoModel []; 

  constructor(
    public certificadoService : ServiceService
  ) { }

  ngOnInit(): void {
  }

}
