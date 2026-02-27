package org.example.modelos;

public abstract class Empleado {
    private int id;
    private String documento;
    private String nombre;
    private String apellido;
    private double sueldoHora;
    private String telefono;
    private String direccion;
    private Empresa empresa;

    public Empleado() {
    }

    public Empleado(int id, String documento, String nombre, String apellido, double sueldoHora, String telefono, String direccion, Empresa empresa) {
        this.id = id;
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldoHora = sueldoHora;
        this.telefono = telefono;
        this.direccion = direccion;
        this.empresa = empresa;
    }
    public double calcularSueldo(int horas) {
        return sueldoHora * horas;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    @Override
    public String toString() {
        return "Empleado{" + "id" + id + "documento" + documento + "nombre" + nombre +
                "apellido" + apellido + "sueldoHora" + sueldoHora + "telefono" + telefono +
                "direccion" + direccion + '}';
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }



    /*-----------*/
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSueldoHora() {
        return sueldoHora;
    }

    public void setSueldoHora(double sueldoHora) {
        this.sueldoHora = sueldoHora;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

}
