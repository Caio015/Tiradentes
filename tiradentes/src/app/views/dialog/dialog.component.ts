import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MatDialogRef } from '@angular/material/dialog';

@Component({
  selector: 'app-dialog',
  templateUrl: './dialog.component.html',
  styleUrls: ['./dialog.component.css']
})
export class DialogComponent implements OnInit {

  public formulario : FormGroup; 

  constructor(
    private formBuilder : FormBuilder,
    public dialogRef: MatDialogRef<DialogComponent>
  ) { }

  ngOnInit(): void {
    this.formulario = this.formBuilder.group({
      nome: ["", [Validators.required]],
      horas: ["", [Validators.required]],
      atividade: ["", [Validators.required]]
    })
  }

  fecharJanela(): void {
    this.dialogRef.close();
  }

}
