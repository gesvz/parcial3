package com.example.demo.Models;

public class Productos {
    private int Id;
    private String Nombre;
    private float Precio;
    private String CategoriaId;
    private String Foto;
    private String FechaCaducidad;
    private String FechaProduccion;

    public Productos(int id, String nombre, float precio, String categoriaId, String foto, String fechaCaducidad, String fechaProduccion) {
        this.Id = id;
        this.Nombre = nombre;
        this.Precio = precio;
        this.CategoriaId = categoriaId;
        this.Foto = foto;
        this.FechaCaducidad = fechaCaducidad;
        this.FechaProduccion = fechaProduccion;
    }

    public Productos() {
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public float getPrecio() {
        return Precio;
    }

    public void setPrecio(float precio) {
        this.Precio = precio;
    }

    public String getCategoriaId() {
        return CategoriaId;
    }

    public void setCategoriaId(String categoriaId) {
        this.CategoriaId = categoriaId;
    }

    public String getFoto() {
        return Foto;
    }

    public void setFoto(String foto) {
        this.Foto = foto;
    }

    public String getFechaCaducidad() {
        return FechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.FechaCaducidad = fechaCaducidad;
    }

    public String getFechaProduccion() {
        return FechaProduccion;
    }

    public void setFechaProduccion(String fechaProduccion) {
        this.FechaProduccion = fechaProduccion;
    }
}