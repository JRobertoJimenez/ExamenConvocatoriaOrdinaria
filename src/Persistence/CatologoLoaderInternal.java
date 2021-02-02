/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.Catalogo;
import Model.Pelicula;

/**
 *
 * @author José Roberto Jiménez
 */
public class CatologoLoaderInternal implements CatalogoLoader {
    public CatologoLoaderInternal(){
        
    }
    
    @Override
    public Catalogo load() {
        Catalogo c=new Catalogo();
        c.addPelicula(new Pelicula(caratula, tiulo, genero, año, director, actores, calificacion, duracion));
        c.addPelicula(new Pelicula(caratula, titulo, genero, año, director, actores, calificacion, duracion));
    }
    
}
