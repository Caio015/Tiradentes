import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MatDialogRef } from '@angular/material/dialog';

@Component({
  selector: 'app-form-dialog',
  templateUrl: './form-dialog.component.html',
  styleUrls: ['./form-dialog.component.css']
})
export class FormDialogComponent implements OnInit {

  public formularioAdd : FormGroup;

  constructor(
    private formBuilder : FormBuilder,
    public dialogRef: MatDialogRef<FormDialogComponent>
  ) { }

  ngOnInit(): void {
    this.formularioAdd = this.formBuilder.group({
      nome: ["", [Validators.required]],
      horas: ["", [Validators.required]],
      atividade: ["", [Validators.required]]
    })
  }

  onNoClick(): void {
    this.dialogRef.close();
  }

}
