package org.example.MODELOS;

import java.time.LocalDate;

public class Asegurado {

    private Long id;
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private String direccion;
    private String telefono;
    private String email;
    private String numeroPoliza;
    private LocalDate fechaInicioVigencia;
    private LocalDate fechaFinVigencia;
    private Double primaAnual;
    private Double sumaAsegurada;
    private String estadoCivil;
    private String ocupacion;
    private String nivelEducacion;

    public Asegurado() {
    }

    public Asegurado(Long id, String nombre, String apellido, LocalDate fechaNacimiento, String direccion, String telefono, String email, String numeroPoliza, LocalDate fechaInicioVigencia, LocalDate fechaFinVigencia, Double primaAnual, Double sumaAsegurada, String estadoCivil, String ocupacion, String nivelEducacion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.numeroPoliza = numeroPoliza;
        this.fechaInicioVigencia = fechaInicioVigencia;
        this.fechaFinVigencia = fechaFinVigencia;
        this.primaAnual = primaAnual;
        this.sumaAsegurada = sumaAsegurada;
        this.estadoCivil = estadoCivil;
        this.ocupacion = ocupacion;
        this.nivelEducacion = nivelEducacion;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumeroPoliza() {
        return numeroPoliza;
    }

    public void setNumeroPoliza(String numeroPoliza) {
        this.numeroPoliza = numeroPoliza;
    }

    public LocalDate getFechaInicioVigencia() {
        return fechaInicioVigencia;
    }

    public void setFechaInicioVigencia(LocalDate fechaInicioVigencia) {
        this.fechaInicioVigencia = fechaInicioVigencia;
    }

    public LocalDate getFechaFinVigencia() {
        return fechaFinVigencia;
    }

    public void setFechaFinVigencia(LocalDate fechaFinVigencia) {
        this.fechaFinVigencia = fechaFinVigencia;
    }

    public Double getPrimaAnual() {
        return primaAnual;
    }

    public void setPrimaAnual(Double primaAnual) {
        this.primaAnual = primaAnual;
    }

    public Double getSumaAsegurada() {
        return sumaAsegurada;
    }

    public void setSumaAsegurada(Double sumaAsegurada) {
        this.sumaAsegurada = sumaAsegurada;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getNivelEducacion() {
        return nivelEducacion;
    }

    public void setNivelEducacion(String nivelEducacion) {
        this.nivelEducacion = nivelEducacion;
    }
}
