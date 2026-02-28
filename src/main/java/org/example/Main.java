package org.example;

import org.example.modelos.Desarrollador;
import org.example.modelos.Empleado;
import org.example.modelos.Empresa;
import org.example.operaciones.IOperacionEmpleado;
import org.example.operaciones.IOperacionEmpresa;
import org.example.operaciones.OperacionEmpleado;
import org.example.operaciones.OperacionEmpresa;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        System.out.println("hello world");
        IOperacionEmpleado opEmpleado = new OperacionEmpleado();
        IOperacionEmpresa opEmpresa = new OperacionEmpresa();

        int op;

        do{
            op = Integer.parseInt(JOptionPane.showInputDialog(
                    "Digite 1 para salir: /n"+
                    "1. Registrara Empresa /n" +
                    "2. Listar Empresa /n"+
                    "3. Registrar Empleado /n" +
                    "4. Listar Empleados /n" +
                    "5. Buscar Empleado por Documento /n" +
                    "6. Calcular Sueldo /n" +
                    "7. Contar Empleados por Empresa /n" +
                    "8. Salir del programa"
            ));

            switch(op){
                case 1:
                    String nombreEmpresa = JOptionPane.showInputDialog("Digite el nombre del empresa :");
                    Empresa empresa = new Empresa();
                    empresa.setNombre(nombreEmpresa);
                    opEmpresa.registrarEmpresa(empresa);
                    JOptionPane.showMessageDialog(null, "Empresa registrado exitosamente");
                    break;
                case 2:
                    opEmpresa.listarEmpresas();
                    JOptionPane.showMessageDialog(null, "Empresa listado exitosamente");
                    break;
                case 3:
                    String documento = JOptionPane.showInputDialog("Digite el documento :");
                    String  nombre = JOptionPane.showInputDialog("Digite el nombre del empleado :");
                    double sueldo = Double.parseDouble(JOptionPane.showInputDialog("Digite sueldo :"));
                    String telefono = JOptionPane.showInputDialog("Digite telefono :");
                    String direccion = JOptionPane.showInputDialog("Digite direccion :");

                    Empresa emAsignada = null;

                    Empleado newEmpleado = new Desarrollador();
                    newEmpleado.setDocumento(documento);
                    newEmpleado.setNombre(nombre);
                    newEmpleado.setSueldoHora(sueldo);
                    newEmpleado.setTelefono(telefono);
                    newEmpleado.setDireccion(direccion);
                    newEmpleado.setEmpresa(emAsignada);

                    opEmpleado.crearEmpleado(newEmpleado);
                    JOptionPane.showMessageDialog(null, "Empleado registrado exitosamente");
                    break;

                case 4:
                    opEmpresa.listarEmpresas n();
                    JOptionPane.showMessageDialog(null, "Empresa listado exitosamente");

            }
        }

   }
} 