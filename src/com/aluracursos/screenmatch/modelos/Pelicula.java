package com.aluracursos.screenmatch.modelos;

import com.aluracursos.screenmacth.calculos.Clasificacion;

public class Pelicula extends Titulo implements Clasificacion {

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    private String director;

    @Override
    public int getClasificacion() {
        return (int) calculaMedia() / 2;
    }
}



