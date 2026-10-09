package com.EjercicioAyudantia.ISoft.dto;

public class TaskRequest {

    private String titulo;
    private String prioridad;
    private String fechaLimite;

    public TaskRequest() {}

    public String getTitulo() {return titulo;}
    public String getPrioridad() {return prioridad;}
    public String getFechaLimite() {return fechaLimite;}

    public void setTitulo(String titulo) {this.titulo = titulo;}
    public void setPrioridad(String prioridad) {this.prioridad = prioridad;}
    public void setFechaLimite(String fechaLimite) {this.fechaLimite = fechaLimite;}
}
