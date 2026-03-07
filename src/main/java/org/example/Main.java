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
                    "-----Menu----- : \n"+
                    "1. Registrara Empresa \n" +
                    "2. Listar Empresa \n"+
                    "3. Registrar Empleado \n" +
                    "4. Listar Empleados \n" +
                    "5. Buscar Empleado por Documento \n" +
                    "6. Calcular Sueldo \n" +
                    "7. Contar Empleados por Empresa \n" +
                    "8. Salir del programa"
            ));

            switch(op){
                case 1:
                    int nit = Integer.parseInt(JOptionPane.showInputDialog("Digite o Nit"));
                    String nombreEmpresa = JOptionPane.showInputDialog("Digite el nombre del empresa :");
                    String direccionEmpresa = JOptionPane.showInputDialog("Digite el dirrecion :");
                    String ciudad = JOptionPane.showInputDialog("Digite la ciudad :");
                    String email = JOptionPane.showInputDialog("Digite el email :");
                    String telefonoEmpresa = JOptionPane.showInputDialog("Digite el telefono :");

                    Empresa empresa = new Empresa();
                    empresa.setNit(nit);
                    empresa.setNombre(nombreEmpresa);
                    empresa.setDireccion(direccionEmpresa);
                    empresa.setCiudad(ciudad);
                    empresa.setEmail(email);
                    empresa.setTelefono(telefonoEmpresa);

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
                    String direccion = JOptionPane.showInputDialog("Digite direccion :");
                    String telefono = JOptionPane.showInputDialog("Digite telefono :");
                    int nitEmpresa = Integer.parseInt(JOptionPane.showInputDialog("Digite el nitEmpresa :"));

                    Empresa empresaAsignada = opEmpresa.buscarEmpresaNit(nitEmpresa);
                    if (empresaAsignada != null) {
                        Empleado nuevoEmpleado = new Desarrollador();
                        nuevoEmpleado.setDocumento(documento);
                        nuevoEmpleado.setNombre(nombre);
                        nuevoEmpleado.setSueldoHora(sueldo);
                        nuevoEmpleado.setTelefono(telefono);
                        nuevoEmpleado.setDireccion(direccion);
                        nuevoEmpleado.setEmpresa(empresaAsignada);

                        opEmpleado.crearEmpleado(nuevoEmpleado);

                        JOptionPane.showMessageDialog(null, "Empleado registrado correctamente");

                    } else {
                        JOptionPane.showMessageDialog(null, "Empresa no encontrada");
                    }
                    break;
                case 4:
                   opEmpleado.listarEmpleados();
                    JOptionPane.showMessageDialog(null, "Empresa listado exitosamente");
                    break;
                case 5:
                    String buscarDocumento = JOptionPane.showInputDialog("Digite el documento a buscar :");
                    Empleado empEncontrado = opEmpleado.buscarPorDocumento(buscarDocumento);
                    if (empEncontrado != null) {
                        JOptionPane.showMessageDialog(null, empEncontrado.toString());
                    }else  {
                        JOptionPane.showMessageDialog(null, "empleado no encontrada");
                    }
                    break;
                case 6:
                    String docSueldo = JOptionPane.showInputDialog("Digite el documento :");
                    int horas = Integer.parseInt(JOptionPane.showInputDialog("Digite el horas :"));

                    double total = opEmpleado.calcularSueldo(docSueldo, horas);
                    JOptionPane.showMessageDialog(null, "Sueldo aplicado correctamente" + total);
                    break;
                case 7:
                    int buscarNit =  Integer.parseInt(JOptionPane.showInputDialog("Digite el nit empresa :"));
                    Empresa emp = opEmpresa.buscarEmpresaNit(buscarNit);
                    if (emp != null) {
                        int cantidad = opEmpleado.contarEmpleado(emp);
                        JOptionPane.showMessageDialog(null, "Cantidad Empleados" + cantidad);
                    }else{
                        JOptionPane.showMessageDialog(null, "Empresa no encontrada");
                    }
                    break;
                case 8:
                    JOptionPane.showMessageDialog(null, "Programa Finalizado");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
            }
        } while (op != 8);

   }
} 