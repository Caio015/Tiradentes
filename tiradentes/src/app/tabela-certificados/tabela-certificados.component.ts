import { AfterViewInit, Component, ViewChild } from '@angular/core';
import { MatPaginator } from '@angular/material/paginator';
import { MatSort } from '@angular/material/sort';
import { MatTable } from '@angular/material/table';
import { CertificadoModel } from '../shared/model/cetrificado.model';
import { ServiceService } from '../shared/service/certificadoService.service';
import { TabelaCertificadosDataSource, TabelaCertificadosItem } from './tabela-certificados-datasource';

@Component({
  selector: 'app-tabela-certificados',
  templateUrl: './tabela-certificados.component.html',
  styleUrls: ['./tabela-certificados.component.css']
})
export class TabelaCertificadosComponent implements AfterViewInit {
  @ViewChild(MatPaginator) paginator!: MatPaginator;
  @ViewChild(MatSort) sort!: MatSort;
  @ViewChild(MatTable) table!: MatTable<TabelaCertificadosItem>;
  dataSource: TabelaCertificadosDataSource;

  certificadoHomologado : CertificadoModel;
  certificadoNaoHomologado : CertificadoModel; 

  /** Columns displayed in the table. Columns IDs can be added, removed, or reordered. */
  displayedColumns = ['id', 'curso', 'atividade', 'horas', 'data'];

  constructor(
    public certificadoService : ServiceService
  ) {
    this.dataSource = new TabelaCertificadosDataSource();
  }

  ngAfterViewInit(): void {
    this.dataSource.sort = this.sort;
    this.dataSource.paginator = this.paginator;
    this.table.dataSource = this.dataSource;
  }

  getCertificados(){
    this.certificadoService.getCertificados().subscribe()
  }
}
