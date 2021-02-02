/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import com.sun.glass.ui.SystemClipboard;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author José Roberto Jiménez
 */
public class ViewConsole implements View{
    
    public ViewConsole(){
        
    }
    
    @Override
    public void mostrar(List<String> data) {
        for (String string : data) {
            System.out.println(string);
        }
    }
    
    public String esperarRespuesta(){
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        return s;
    }
    
}
