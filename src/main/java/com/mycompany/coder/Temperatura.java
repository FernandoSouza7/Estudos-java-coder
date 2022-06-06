/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.coder;

/**
 *
 * @author matheus
 */
public class Temperatura {
    
    public static void main(String[] args) {
        
        final double FATOR  = 5.0 / 9.0;
        final double AJUSTE = 32;
        
        final double fahrenheit = 86;
        double celsius = (fahrenheit - AJUSTE) * FATOR;
        
        System.out.println("O resultado é: " + celsius); 
    }
}
