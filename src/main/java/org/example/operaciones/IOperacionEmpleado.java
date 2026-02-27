package org.example.operaciones;

import org.example.modelos.Empleado;
import org.example.modelos.Empresa;

public interface IOperacionEmpleado {
    void crearEmpleado(Empleado empleado);
    void listarEmpleados();
    Empleado buscarPorDocumento(String documento);
    double calcularSueldo(String documento, int horas);
    int contarEmpleado(Empresa empresa);
}
