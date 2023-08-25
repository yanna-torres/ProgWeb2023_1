/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista01web;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Lista01Web {

    public static void main(String[] args) throws Exception {
        Lista01Web.q11();
    }

    public static void q03() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Calculo da media aritmetica de 3 notas");

            System.out.print("Digite a primeira nota: ");
            float nota1 = sc.nextFloat();

            System.out.print("Digite a segunda nota: ");
            float nota2 = sc.nextFloat();

            System.out.print("Digite a terceira nota: ");
            float nota3 = sc.nextFloat();

            float media = (nota1 + nota2 + nota3) / 3;
            System.out.println("A media das notas e: " + media);
        } catch (InputMismatchException error) {
            System.out.println("Nao foi digitado um numero");
        }
        sc.close();

    }

    public static void q07() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Quantas notas voce deseja adicionar: ");
            int quant = sc.nextInt();

            float somaNotas = 0;
            for (int i = 0; i < quant; i++) {
                System.out.print("Digite a nota "+ (i+1) +  ": ");
                somaNotas += sc.nextFloat();
            }
            
            float media = somaNotas / quant;
            
            System.out.println("A media do discente e: " + media);
            if (media < 7) {
                System.out.println("O discente foi reprovado");
            } else {
                System.out.println("O discente foi aprovado");
            }
        } catch (InputMismatchException error) {
            System.out.println("Nao foi digitado um numero");
        }
        sc.close();
    }
    
    public static void q11() throws Exception {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Digite um número entre 0 e 10: ");
            int number = sc.nextInt();
            if (number < 0 || number > 10) {
                throw new Exception("error");
            }
            for (int i = 0; i <= 10; i ++) {
                System.out.println(i + " X " + number + " = " + number*i);
            }
        } catch (InputMismatchException error) {
            System.out.println("Nao foi digitado um numero");
            
        } catch (Exception error) {
            System.out.println("Número fora dos limites");
        }
        sc.close();
    }

}
