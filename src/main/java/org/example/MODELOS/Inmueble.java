package org.example.MODELOS;

public class Inmueble {

    private Long id;
    private String direccion;
    private String tipoInmueble;
    private Double superficie;
    private Integer numHabitaciones;
    private Integer numBanos;
    private String estadoConservacion;
    private Double valorInmueble;
    private String serviciosIncluidos;
    private String ubicacionGeografica;

    public Inmueble() {
    }

    public Inmueble(Long id, String direccion, String tipoInmueble, Double superficie, Integer numHabitaciones, Integer numBanos, String estadoConservacion, Double valorInmueble, String serviciosIncluidos, String ubicacionGeografica) {
        this.id = id;
        this.direccion = direccion;
        this.tipoInmueble = tipoInmueble;
        this.superficie = superficie;
        this.numHabitaciones = numHabitaciones;
        this.numBanos = numBanos;
        this.estadoConservacion = estadoConservacion;
        this.valorInmueble = valorInmueble;
        this.serviciosIncluidos = serviciosIncluidos;
        this.ubicacionGeografica = ubicacionGeografica;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTipoInmueble() {
        return tipoInmueble;
    }

    public void setTipoInmueble(String tipoInmueble) {
        this.tipoInmueble = tipoInmueble;
    }

    public Double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(Double superficie) {
        this.superficie = superficie;
    }

    public Integer getNumHabitaciones() {
        return numHabitaciones;
    }

    public void setNumHabitaciones(Integer numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public Integer getNumBanos() {
        return numBanos;
    }

    public void setNumBanos(Integer numBanos) {
        this.numBanos = numBanos;
    }

    public String getEstadoConservacion() {
        return estadoConservacion;
    }

    public void setEstadoConservacion(String estadoConservacion) {
        this.estadoConservacion = estadoConservacion;
    }

    public Double getValorInmueble() {
        return valorInmueble;
    }

    public void setValorInmueble(Double valorInmueble) {
        this.valorInmueble = valorInmueble;
    }

    public String getServiciosIncluidos() {
        return serviciosIncluidos;
    }

    public void setServiciosIncluidos(String serviciosIncluidos) {
        this.serviciosIncluidos = serviciosIncluidos;
    }

    public String getUbicacionGeografica() {
        return ubicacionGeografica;
    }

    public void setUbicacionGeografica(String ubicacionGeografica) {
        this.ubicacionGeografica = ubicacionGeografica;
    }
}
