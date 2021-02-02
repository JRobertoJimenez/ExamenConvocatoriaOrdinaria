/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author José Roberto Jiménez
 */
public class Pelicula{
    private final String caratula;
    private final String titulo;
    private final String genero;
    private final String año;
    private final String director;
    private final String[] actores;
    private final String calificacion;
    private final String duracion;

    public Pelicula(String caratula, String titulo, String genero, String año, String director, String[] actores, String calificacion, String duracion) {
        this.caratula = caratula;
        this.titulo = titulo;
        this.genero = genero;
        this.año = año;
        this.director = director;
        this.actores = actores;
        this.calificacion = calificacion;
        this.duracion = duracion;
    }

    
    String getAllInformation(){
        String aux="";
        aux+=titulo+" "+genero+" "+año+" "+director+" ";
        for (String actore : actores) {
            aux+=actore+" ";
        }
        return aux;
    }
    
    

    String getGenero() {
        return genero;
    }


    String getTitulo() {
        return titulo;
    }
    
}
