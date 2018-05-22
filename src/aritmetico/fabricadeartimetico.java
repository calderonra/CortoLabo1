/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aritmetico;
import fabricadeoperacion.fabricainter;
/**
 *
 * @author UCA
 */
public class fabricadeartimetico implements fabricainter {
    public aritmetico getaritmetico(String caso){
        switch(caso){
            case "suma":
                return new Suma;
        }
    }
    
}
