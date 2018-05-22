/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricadeoperacion;
import aritmetico.aritmetico;
/**
 *
 * @author UCA
 */
public class productordefabricas {
    public static fabricainter getfabrica(String type){
        switch (type){
        case "aritmetico":
            return new fabricadearitmetico();
    }
        return null;
    }
}
