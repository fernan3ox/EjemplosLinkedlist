/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploslinkedlist;

import java.util.LinkedList;
import javax.swing.JOptionPane;
import modelo.Persona;

/**
 *
 * @author Fernandito
 */
public class EjemplosLinkedlist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        LinkedList<Persona> lista=new LinkedList<>();
        
        lista.add(new Persona("1","Persona"));
        lista.add(new Persona("2","Pedro"));
        lista.add(new Persona("3","Juan"));
        
        JOptionPane.showMessageDialog(null, imprimirLista(lista));
        
        lista.addFirst(new Persona("4","Jorgito"));
        
        JOptionPane.showMessageDialog(null, imprimirLista(lista));
        
        lista.removeFirst();
        
        JOptionPane.showMessageDialog(null, imprimirLista(lista));
        
    }
    
    private static String imprimirLista(LinkedList<Persona> lista ){
        
        String result="";
        
        for (int i = 0; i < lista.size() ; i++) {
            
            result += lista.get(i).toString();
            
        }
        
        return result;
    }
}
