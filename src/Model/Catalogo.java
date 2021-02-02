/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author José Roberto Jiménez
 */
public class Catalogo {
    private Map <String,Pelicula> list;
    private final Map<String,List<String>> genero;
    private final List<String> novedades;
    private final List<String> vistas;
    private final List<String> valoradas;
    public Catalogo() {
        list=new HashMap<>();
        genero=new HashMap<>();
        novedades=new ArrayList<>();
        vistas=new ArrayList<>();
        valoradas=new ArrayList<>();
    }
    
    public void addPelicula(Pelicula p){
        if(!genero.containsKey(p.getGenero())){
            genero.put(p.getGenero(), new ArrayList<>());
        }
        list.put(p.getTitulo(), p);
        genero.get(p.getGenero()).add(p.getTitulo());
    }
    
    public void addNovedad(Pelicula p){
        novedades.add(p.getTitulo());
    }
    public void addVista(Pelicula p){
        vistas.add(p.getTitulo());
    }
    public void addValorada(Pelicula p){
        valoradas.add(p.getTitulo());
    }
    
    public Set<String> getPeliculas(){
        return list.keySet();
    }
    
    public List<String> getNovedades(){
        return novedades;
    }
    
    public List<String> getVistas(){
        return vistas;
    }
    
    public List<String> getValoradas(){
        return valoradas;
    }
    
   
    
    
    public List<String> search(String s){
        List<String> auxl=new ArrayList<>();
        for (Pelicula value : list.values()) {
            if(value.getAllInformation().contains(s)){
                auxl.add(value.getTitulo());
            }
        }
        
        return auxl;
    }

    public boolean contains(String s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<String> getInformation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
    
    
}