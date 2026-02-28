package org.example.modelos;

public class Empresa {
    private int nit;
    private String nombre;
    private String apellido;
    private String direccion;
    private String ciudad;
    private String email;
    private String telefono;

    public Empresa(int nit, String nombre, String apellido, String direccion, String ciudad, String email, String telefono) {
        this.nit = nit;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.email = email;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Empresa{" + "nit" + nit + "nombre" + nombre +
                "apellido" + apellido + "direccion" + direccion  + "ciudad" + ciudad +
                "email" + email + "telefono" + telefono + '}';
    }
    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
