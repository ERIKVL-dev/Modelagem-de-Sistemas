/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.helloworld;

import java.util.Scanner;

/**
 *
 * @author aluno.senai
 */
public class HelloWorld {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num1; 
        int num2;
        
        System.out.println("Qual é o primeiro numero?: ");
        num1 = sc.nextInt();
        System.out.println("Qual é o segundo numero?: ");
        num2 = sc.nextInt();
        
        int Soma = (num1+num2)/2;
        
        
        System.out.println("A Média dos dois numeros é: "+Soma+"!");
    }
}
