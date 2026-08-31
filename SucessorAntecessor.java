package atividade;

import java.util.Scanner;

public class atvdd14qts {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escolha uma atividade (1 a 14): ");
        int opcaoSelecionada = sc.nextInt();

        switch (opcaoSelecionada) {
            case 1 -> Questao1();
            case 2 -> Questao2();
            case 3 -> Questao3();
            case 4 -> Questao4();
            case 5 -> Questao5();
            case 6 -> Questao6();
            case 7 -> Questao7();
            case 8 -> Questao8();
            case 9 -> Questao9();
            case 10 -> Questao10();
            case 11 -> Questao11();
            case 12 -> Questao12();
            case 13 -> Questao13();
            case 14 -> Questao14();
            default -> System.out.println("Opção inválida! Escolha entre 1 e 14.");
        }
        sc.close();
    }

    
    public static void Questao1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();

        if (num1 == num2) {
            System.out.println("Os números são iguais!");
        } else if (num1 > num2) {
            System.out.println("Maior = " + num1 + " / Menor = " + num2);
        } else {
            System.out.println("Maior = " + num2 + " / Menor = " + num1);
        }
    }

    public static void Questao2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();

        double media = (num1 + num2) / 2.0;
        System.out.println("A média dos dois números é: " + media);
    }

    public static void Questao3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("O número é PAR.");
        } else {
            System.out.println("O número é ÍMPAR.");
        }
    }

    public static void Questao4() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o ano de seu nascimento: ");
        int ano = sc.nextInt();
        System.out.println("Sua idade é: " + (2026 - ano) + " anos.");
    }

    public static void Questao5() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int num = sc.nextInt();
        System.out.println("Antecessor: " + (num - 1));
        System.out.println("Sucessor: " + (num + 1));
    }

    public static void Questao6() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nome = sc.nextLine();
        System.out.print("Digite a primeira nota: ");
        double n1 = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double n2 = sc.nextDouble();
        System.out.print("Digite a terceira nota: ");
        double n3 = sc.nextDouble();

        double media = (n1 + n2 + n3) / 3.0;
        System.out.printf("Média de %s: %.2f\n", nome, media);

        if (media >= 7.0) {
            System.out.println("Status: APROVADO");
        } else {
            System.out.println("Status: REPROVADO");
        }
    }

    public static void Questao7() {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[20];
        double[] medias = new double[20];

        for (int i = 0; i < 20; i++) {
            System.out.println("\n--- Aluno " + (i + 1) + " ---");
            System.out.print("Nome: ");
            nomes[i] = sc.nextLine();
            System.out.print("Média: ");
            medias[i] = sc.nextDouble();
            sc.nextLine(); // Limpar buffer do scanner
        }

        System.out.println("\n=== Alunos com média acima de 8.0 ===");
        boolean encontrou = false;
        for (int i = 0; i < 20; i++) {
            if (medias[i] > 8.0) {
                System.out.println(nomes[i] + " - Média: " + medias[i]);
                encontrou = true;
            }
        }

        if (!encontrou) {
            System.out.println("Nenhum aluno obteve média acima de 8.0.");
        }
    }

    public static void Questao8() {
        Scanner sc = new Scanner(System.in);
        int contadorNoIntervalo = 0;

        System.out.println("Digite 80 números:");
        for (int i = 1; i <= 80; i++) {
            System.out.print("Número " + i + ": ");
            double num = sc.nextDouble();
            if (num >= 10 && num <= 150) {
                contadorNoIntervalo++;
            }
        }

        System.out.println("Total de números no intervalo [10, 150]: " + contadorNoIntervalo);
    }

    public static void Questao9() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome do vendedor: ");
        String nome = sc.nextLine();
        System.out.print("Salário fixo (R$): ");
        double salarioFixo = sc.nextDouble();
        System.out.print("Total de vendas no mês (R$): ");
        double totalVendas = sc.nextDouble();

        double comissao = totalVendas * 0.15;
        double salarioFinal = salarioFixo + comissao;

        System.out.println("\n--- Resumo de Pagamento ---");
        System.out.println("Vendedor: " + nome);
        System.out.printf("Salário Fixo: R$ %.2f\n", salarioFixo);
        System.out.printf("Comissão (15%%): R$ %.2f\n", comissao);
        System.out.printf("Salário Final: R$ %.2f\n", salarioFinal);
    }

    public static void Questao10() {
        Scanner sc = new Scanner(System.in);
        int pares = 0, impares = 0;

        System.out.println("Digite 10 números inteiros:");
        for (int i = 1; i <= 10; i++) {
            System.out.print("Número " + i + ": ");
            int num = sc.nextInt();
            if (num % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Quantidade de pares: " + pares);
        System.out.println("Quantidade de ímpares: " + impares);
    }

    public static void Questao11() {
        Scanner sc = new Scanner(System.in);
        int somaPares = 0;
        int somaImpares = 0;
        int qtdImpares = 0;

        System.out.println("Digite 10 números inteiros:");
        for (int i = 1; i <= 10; i++) {
            System.out.print("Número " + i + ": ");
            int num = sc.nextInt();
            if (num % 2 == 0) {
                somaPares += num;
            } else {
                somaImpares += num;
                qtdImpares++;
            }
        }

        System.out.println("Soma dos números pares: " + somaPares);
        if (qtdImpares > 0) {
            double mediaImpares = (double) somaImpares / qtdImpares;
            System.out.printf("Média aritmética dos números ímpares: %.2f\n", mediaImpares);
        } else {
            System.out.println("Nenhum número ímpar foi digitado para calcular a média.");
        }
    }

    public static void Questao12() {
        Scanner sc = new Scanner(System.in);
        int somaPositivos = 0;
        int qtdNegativos = 0;

        System.out.println("Digite 50 números inteiros:");
        for (int i = 1; i <= 50; i++) {
            System.out.print("Número " + i + ": ");
            int num = sc.nextInt();
            if (num > 0) {
                somaPositivos += num;
            } else if (num < 0) {
                qtdNegativos++;
            }
        }

        System.out.println("a) Soma dos números positivos: " + somaPositivos);
        System.out.println("b) Quantidade de valores negativos: " + qtdNegativos);
    }

    public static void Questao13() {
        int somaPares = 0;

        System.out.println("Números pares entre 85 e 907:");
        for (int i = 85; i <= 907; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                somaPares += i;
            }
        }

        System.out.println("\n\nSoma acumulada de todos os pares: " + somaPares);
    }

    public static void Questao14() {
        Scanner sc = new Scanner(System.in);

        String nomeMaisPesada = "";
        double Mpeso = -1;

        String nomeMaisAlta = "";
        double Maltura = -1;

        for (int i = 1; i <= 20; i++) {
            System.out.println("\n--- Pessoa " + i + " ---");
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Altura (m): ");
            double altura = sc.nextDouble();
            System.out.print("Peso (kg): ");
            double peso = sc.nextDouble();
            sc.nextLine(); 

            if (peso > Mpeso) {
            	Mpeso = peso;
                nomeMaisPesada = nome;
            }

            if (altura > Maltura) {
                Maltura = altura;
                nomeMaisAlta = nome;
            }
        }

        System.out.println("\n=== RESULTADO DA ANÁLISE FÍSICA ===");
        System.out.printf("Pessoa mais pesada: %s com %.2f kg\n", nomeMaisPesada, Mpeso);
        System.out.printf("Pessoa mais alta: %s com %.2f m\n", nomeMaisAlta, Maltura);
    }
}
