/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz.grafica;

/**
 *
 * @author dam2
 */
public class ComboOptionOperaciones{
    private String text;
    private Operaciones operaciones;
    
    public ComboOptionOperaciones(String txt,Operaciones op){
        text=txt;
        operaciones=op;
    }

    @Override
    public String toString() {
        return text;
    }
    
    
}
