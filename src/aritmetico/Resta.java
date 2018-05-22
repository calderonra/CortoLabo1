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
public abstract class Resta implements aritmetico  {
    @Override
    public int restar(int a,int b){
        int restar;
        restar = a-b;
        return restar;
    }
}
