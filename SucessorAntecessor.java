 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sucessorantecessor;

import java.util.Scanner;

/**
 *
 * @author aluno.senai
 */
public class SucessorAntecessor {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int num;
        
        System.out.println("Qual é o numero desejado?: ");
        num = sc.nextInt();
        System.out.println("Seu Sucessor é: "+(num+1)+"! ");
        System.out.println("Seu antecessor é: "+(num-1)+"! ");
    }
}
