/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.imparoupar;

import java.util.Scanner;

/**
 *
 * @author aluno.senai
 */
public class CalcularIdade {
    
    public static void main(String[] args) {
 
    Scanner sc = new Scanner(System.in);
    
    int ano;    
    
    System.out.println("Qual é o ano que vc nasceu?: ");
    ano = sc.nextInt();

    System.out.println("Sua idade é: "+(2026-ano)+"!");
    
    }
}