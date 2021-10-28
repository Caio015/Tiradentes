import { TestBed } from '@angular/core/testing';

import { CertificadoServiceService } from './certificado-service.service';

describe('CertificadoServiceService', () => {
  let service: CertificadoServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(CertificadoServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
