package org.example.MODELOS;

public class Asesor {

    private Long id;
    private String nombre;
    private String apellido;
    private String numLicencia;
    private String especialidad;
    private Integer anosExperiencia;
    private String tituloAcademico;
    private String institucionAcademica;
    private String correoElectronico;
    private String telefono;

    public Asesor() {
    }

    public Asesor(Long id, String nombre, String apellido, String numLicencia, String especialidad, Integer anosExperiencia, String tituloAcademico, String institucionAcademica, String correoElectronico, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numLicencia = numLicencia;
        this.especialidad = especialidad;
        this.anosExperiencia = anosExperiencia;
        this.tituloAcademico = tituloAcademico;
        this.institucionAcademica = institucionAcademica;
        this.correoElectronico = correoElectronico;
        this.telefono = telefono;
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

    public String getNumLicencia() {
        return numLicencia;
    }

    public void setNumLicencia(String numLicencia) {
        this.numLicencia = numLicencia;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Integer getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(Integer anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    public String getTituloAcademico() {
        return tituloAcademico;
    }

    public void setTituloAcademico(String tituloAcademico) {
        this.tituloAcademico = tituloAcademico;
    }

    public String getInstitucionAcademica() {
        return institucionAcademica;
    }

    public void setInstitucionAcademica(String institucionAcademica) {
        this.institucionAcademica = institucionAcademica;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
