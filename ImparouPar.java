/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.imparoupar;

import java.util.Scanner;

/**
 *
 * @author aluno.senai
 */
public class ImparouPar {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        
        int num1; 
 
        System.out.println("Qual é o ,numero?: ");
        num1 = sc.nextInt();
        
        if( num1 %2==0){
            System.out.println("O Numero é par");
        }
        else {
            System.out.println("O Numero é impar");
        }
    }
}
