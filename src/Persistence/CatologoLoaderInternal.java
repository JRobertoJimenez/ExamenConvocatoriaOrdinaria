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
        String[] actores={"dibujos"};
        Pelicula p1=new Pelicula("img0", "Caperucita Roja", "Miedo", "1995", "Mike",actores, "4", "90");
        Pelicula p2=new Pelicula("img1", "Blancanieves", "Comedia", "1998", "Jhon", actores, "3.8", "100");
        c.addPelicula(p1);
        c.addPelicula(p2);
        c.addNovedad(p1);
        c.addVista(p2);
        return c;
    }
    
}
