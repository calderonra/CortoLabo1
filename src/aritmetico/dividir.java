/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aritmetico;

/**
 *
 * @author UCA
 */
public abstract class dividir implements aritmetico{
   @Override
    public float dividir(float a,float b){
        float dividir;
        dividir = a/b;
        return dividir;
    }
    
}
