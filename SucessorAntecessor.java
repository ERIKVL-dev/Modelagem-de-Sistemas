package atividade;

import java.util.Scanner;

public class atvdd14qts {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escolha uma atividade (1 a 14): ");
        int opcaoSelecionada = sc.nextInt();

        switch (opcaoSelecionada) {
            case 1 -> executarAtividade1();
            case 2 -> executarAtividade2();
            case 3 -> executarAtividade3();
            case 4 -> executarAtividade4();
            case 5 -> executarAtividade5();
            case 6 -> executarAtividade6();
            case 7 -> executarAtividade7();
            case 8 -> executarAtividade8();
            case 9 -> executarAtividade9();
            case 10 -> executarAtividade10();
            case 11 -> executarAtividade11();
            case 12 -> executarAtividade12();
            case 13 -> executarAtividade13();
            case 14 -> executarAtividade14();
            default -> System.out.println("Opção inválida! Escolha entre 1 e 14.");
        }
        sc.close();
    }

    public static void executarAtividade1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual é o primeiro numero?: ");
        int num1 = sc.nextInt();
        System.out.println("Qual é o segundo numero?: ");
        int num2 = sc.nextInt();

        if (num1 == num2) {
            System.out.println("Os numeros são iguais!!");
        } else if (num1 > num2) {
            System.out.println("O Primeiro numero é maior que o segundo numero!");
        } else {
            System.out.println("O Segundo numero é maior que o primeiro Numero!");
        }
    }

    public static void executarAtividade2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual é o primeiro numero?: ");
        int num1 = sc.nextInt();
        System.out.println("Qual é o segundo numero?: ");
        int num2 = sc.nextInt();
        
        double soma = (num1 + num2) / 2.0; 
        System.out.println("A Média dos dois numeros é: " + soma + "!");
    }

    public static void executarAtividade3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual é o numero?: ");
        int num1 = sc.nextInt();

        if (num1 % 2 == 0) {
            System.out.println("O Numero é par");
        } else {
            System.out.println("O Numero é impar");
        }
    }

    public static void executarAtividade4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual é o ano que vc nasceu?: ");
        int ano = sc.nextInt();
        System.out.println("Sua idade é: " + (2026 - ano) + "!");
    }

    public static void executarAtividade5() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual é o numero desejado?: ");
        int num = sc.nextInt();
        System.out.println("Seu Sucessor é: " + (num + 1) + "! ");
        System.out.println("Seu antecessor é: " + (num - 1) + "! ");
    }

    public static void executarAtividade6() { System.out.println("Atividade 6 ainda não implementada."); }
    public static void executarAtividade7() { System.out.println("Atividade 7 ainda não implementada."); }
    public static void executarAtividade8() { System.out.println("Atividade 8 ainda não implementada."); }
    public static void executarAtividade9() { System.out.println("Atividade 9 ainda não implementada."); }
    public static void executarAtividade10() { System.out.println("Atividade 10 ainda não implementada."); }
    public static void executarAtividade11() { System.out.println("Atividade 11 ainda não implementada."); }
    public static void executarAtividade12() { System.out.println("Atividade 12 ainda não implementada."); }
    public static void executarAtividade13() { System.out.println("Atividade 13 ainda não implementada."); }
    public static void executarAtividade14() { System.out.println("Atividade 14 ainda não implementada."); }
}
