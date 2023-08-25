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

    public static void main(String[] args) {
        Lista01Web.q03();
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

    }

}
