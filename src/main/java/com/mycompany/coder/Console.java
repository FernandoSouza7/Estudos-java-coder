package com.mycompany.coder;

import java.util.Scanner;

public class Console {
    
    public static void main(String[] args) {
        
        System.out.printf("Salário: %.1f%n", 1234.5678);
        System.out.printf("Nome: %s%n", "João");
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o seu nome: ");
        String nome = entrada.nextLine();
        
        System.out.println("Digite o seu sobrenome: ");
        String sobrenome = entrada.nextLine();
        
        System.out.println("Seu nome completo é: " + nome + " " + sobrenome);
        
        System.out.println("Digite a sua idade: ");
        int idade = entrada.nextInt();
        
        System.out.println("Você tem " + idade + " anos de idade.");       
    }
}
