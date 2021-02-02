/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.convocatoria.ordinaria;


import Model.Catalogo;
import Persistence.CatologoLoaderInternal;
import View.ViewConsole;

/**
 *
 * @author José Roberto Jiménez
 */
public class ExamenConvocatoriaOrdinaria {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Catalogo c=new CatologoLoaderInternal().load();
        ViewConsole v=new ViewConsole();
        System.out.println("Si desea buscar por genero introduzca g y s para busqueda personalizada; si desea novedades n; para más vistas v; y m para mejor valoradas");
        String s= v.esperarRespuesta();
        switch (s){
            case "g":
                System.out.println();
                v.mostrar(c.getGeneros());
                System.out.println("Selecione un genero:");
                v.mostrar(c.getGenero(v.esperarRespuesta()));
                selectPelicula(v,c);
                break;
            case "s":
                System.out.println("Indique el parámetro de busqueda:");
                String sf=v.esperarRespuesta();
                v.mostrar(c.search(sf));
                selectPelicula(v,c);
                break;
            case "n":
                v.mostrar(c.getNovedades());
                selectPelicula(v,c);
                break;
            case "v":
                v.mostrar(c.getVistas());
                selectPelicula(v,c);
                break;
            case "m":
                v.mostrar(c.getValoradas());
                selectPelicula(v,c);
                break;
            case "a":
                v.mostrar(c.getPeliculas());
                selectPelicula(v,c);
                break;
        }
                
        
    }

    private static void selectPelicula(ViewConsole v,Catalogo c) {
        System.out.println("Indique el titulo que desea seleccionar:");
        v.mostrar(c.getPelicula(v.esperarRespuesta()));
    }
}
    
