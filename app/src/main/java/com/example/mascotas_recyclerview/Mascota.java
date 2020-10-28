package com.example.mascotas_recyclerview;

public class Mascota {

    private String nombre;
    private String numero;
    private int foto;

    public Mascota(int foto, String numero, String nombre){

        this.foto = foto;
        this.numero = numero;
        this.nombre = nombre;

    }


    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
