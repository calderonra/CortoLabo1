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
public abstract class multiplicacion implements aritmetico{
    @Override
public float multiplicar(float a,float b){
        float multiplicar;
        multiplicar = a*b;
        return multiplicar;
    }



}
    

