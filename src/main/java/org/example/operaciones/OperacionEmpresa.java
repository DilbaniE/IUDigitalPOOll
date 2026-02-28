package org.example.operaciones;

import org.example.modelos.Empresa;

import java.util.ArrayList;
import java.util.List;

public class OperacionEmpresa implements IOperacionEmpresa {
    private List<Empresa> empresas = new ArrayList<>();

    @Override
    public void registrarEmpresa(Empresa empresa) {
        empresas.add(empresa);
    }

    @Override
    public void listarEmpresas() {
        for (Empresa empresa : empresas) {
            System.out.println(empresa);
        }
    }

    @Override
    public Empresa buscarEmpresaNit(int nit) {
        for (Empresa empresa : empresas) {
            if (empresa.getNit() == nit) {
                return empresa;
            }
        }
        return null;
    }
}
