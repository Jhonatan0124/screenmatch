package com.aluracursos.screenmatch.modelos;

public class Titulo {
    private String Nombre;
    private int fechaDeLanzamiento;
    private int duracionEnMinutos;
    private boolean incluidoEnElPLan;
    private double sumaDeLasEvaluaciones;
    private int totalDeLasEvaluaciones;

    public String getNombre() {
        return Nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public boolean isIncluidoEnElPLan() {
        return incluidoEnElPLan;
    }

    /* Set para colocar datos, recibe un atributo string de nombre, nombre */
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    /* get para obtener datos*/

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public void setIncluidoEnElPLan(boolean incluidoEnElPLan) {
        this.incluidoEnElPLan = incluidoEnElPLan;
    }

    public int getTotalDeLasEvaluaciones(){
        return totalDeLasEvaluaciones;
    }

    public void muestraFichaTecnica(){
        System.out.println("El nombre de la pelicula es: "+ Nombre);
        System.out.println("Su fecha de lanzamiento es: "+ fechaDeLanzamiento);
        System.out.println("Duracxion en Minutos: "+ duracionEnMinutos);
    }

    public void evalua(double nota){
        sumaDeLasEvaluaciones += nota;
        /* sumaDeLasEvaluaciones = sumaDeLasEvaluaciones + nota; */
        totalDeLasEvaluaciones++;/* Se incrementa a ella misma + 1 */
    }

    public double calculaMedia(){
        return sumaDeLasEvaluaciones / totalDeLasEvaluaciones;
    }
}
