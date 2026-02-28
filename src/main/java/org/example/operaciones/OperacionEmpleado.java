package org.example.operaciones;

import org.example.modelos.Empleado;
import org.example.modelos.Empresa;

import java.util.ArrayList;
import java.util.List;

public class OperacionEmpleado implements IOperacionEmpleado{
    private List<Empleado> listempleados = new ArrayList<>();

    @Override
    public void crearEmpleado(Empleado empleado) {
        listempleados.add(empleado);
    }

    @Override
    public void listarEmpleados(){
        for(Empleado empleado: listempleados){
            System.out.println(empleado);
        }
    }

    @Override
    public Empleado buscarPorDocumento(String documento) {
        for(Empleado empleado: listempleados){
            if(empleado.getDocumento().equals(documento)){
                return empleado;
            }
        }
        return null;
    }

    @Override
    public double calcularSueldo(String documento, int horas){
        Empleado empleado = buscarPorDocumento(documento);
        if (empleado != null){
            return empleado.calcularSueldo(horas);
        }
        return 0;
    }

    @Override
    public int contarEmpleado(Empresa empresa){
        int contar = 0;
        for(Empleado empleado: listempleados){
            if(empleado.getEmpresa().equals(empresa)){
                contar++;
            }
        }
        return contar;
    }

}