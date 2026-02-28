package org.example.operaciones;

import org.example.modelos.Empresa;

public interface IOperacionEmpresa {
    void registrarEmpresa(Empresa empresa);
    void listarEmpresas();
    Empresa buscarEmpresaNit(int nit);
}
