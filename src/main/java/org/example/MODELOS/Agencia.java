package org.example.MODELOS;

public class Agencia {

    private Long id;
    private String nombre;
    private String direccion;
    private String telefono;
    private String correoElectronico;
    private String numLicencia;
    private String tipoAgencia;
    private Integer anosExperiencia;
    private Integer numEmpleados;
    private String horarioAtencion;

    public Agencia() {
    }

    public Agencia(Long id, String nombre, String direccion, String telefono, String correoElectronico, String numLicencia, String tipoAgencia, Integer anosExperiencia, Integer numEmpleados, String horarioAtencion) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.numLicencia = numLicencia;
        this.tipoAgencia = tipoAgencia;
        this.anosExperiencia = anosExperiencia;
        this.numEmpleados = numEmpleados;
        this.horarioAtencion = horarioAtencion;
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

    public String getNumLicencia() {
        return numLicencia;
    }

    public void setNumLicencia(String numLicencia) {
        this.numLicencia = numLicencia;
    }

    public String getTipoAgencia() {
        return tipoAgencia;
    }

    public void setTipoAgencia(String tipoAgencia) {
        this.tipoAgencia = tipoAgencia;
    }

    public Integer getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(Integer anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    public Integer getNumEmpleados() {
        return numEmpleados;
    }

    public void setNumEmpleados(Integer numEmpleados) {
        this.numEmpleados = numEmpleados;
    }

    public String getHorarioAtencion() {
        return horarioAtencion;
    }

    public void setHorarioAtencion(String horarioAtencion) {
        this.horarioAtencion = horarioAtencion;
    }
}
