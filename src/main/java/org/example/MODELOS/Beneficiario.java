package org.example.MODELOS;

import java.time.LocalDate;

public class Beneficiario {

    private Long id;
    private String nombre;
    private String apellido;
    private String documentoIdentidad;
    private String parentesco;
    private LocalDate fechaNacimiento;
    private String direccion;
    private String telefono;
    private String correoElectronico;
    private Double porcentajeBeneficio;

    public Beneficiario() {
    }

    public Beneficiario(Long id, String nombre, String apellido, String documentoIdentidad, String parentesco, LocalDate fechaNacimiento, String direccion, String telefono, String correoElectronico, Double porcentajeBeneficio) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.documentoIdentidad = documentoIdentidad;
        this.parentesco = parentesco;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.porcentajeBeneficio = porcentajeBeneficio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public void setDocumentoIdentidad(String documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public Double getPorcentajeBeneficio() {
        return porcentajeBeneficio;
    }

    public void setPorcentajeBeneficio(Double porcentajeBeneficio) {
        this.porcentajeBeneficio = porcentajeBeneficio;
    }
}
