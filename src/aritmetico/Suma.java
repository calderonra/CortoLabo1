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
public abstract class Suma implements aritmetico{
    @Override
    public int sumar(int a,int b){
        int sumar;
        sumar = a+b;
        return sumar ;
    }
}
