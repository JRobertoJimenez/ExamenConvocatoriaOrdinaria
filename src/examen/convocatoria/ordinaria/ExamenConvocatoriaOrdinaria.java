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
        
        v.mostrar(c.getInformation());
        String s=v.esperarRespuesta();
        while(!c.contains(s)){
            System.out.println("Lo sentimos, catalogo no disponible, elija de nuevo:");
            s= System.console().readLine();
            
        }
        components.get(s);
    }
    
}
