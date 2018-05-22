/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Container;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author UCA
 */
public class Ventana extends JFrame {
private JButton boton,boton2,boton3,boton4;
    public Ventana() {
        super("Calculadora :0");
        initComponent();
    }

    public void initComponent() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setSize(300, 300); //tamaño de la ventana 
        boton = new JButton("Suma");
        boton.setBounds(10,200, 150, 30);
        boton2 = new JButton("resta");
        boton2.setBounds(10,250, 150, 30);
        boton3= new JButton("multiplicacion");
        boton3.setBounds(10,300, 150, 30);
        boton4 = new JButton("division");
        boton4.setBounds(10,150, 150, 30);
       Container contenedor = getContentPane();
        contenedor.add(boton);
        contenedor.add(boton2);
        contenedor.add(boton3);
        contenedor.add(boton4);
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                   //aqui va el metodo de suma que no sirve de momento :c
            }
        });
        
         boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                   //aqui va el metodo de resto que no sirve de momento :c
            }
        });
          boton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                   //aqui va el metodo de multiplicacion que no sirve de momento :c
            }
        });
           boton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                   //aqui va el metodo de dividir que no sirve de momento :c
            }
        });
           
    
        
        
        
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }
}
