// Escreva um programa que leia um n�mero inteiro de 1 a 7 e informe o dia da semana correspondente,
// sendo domingo o dia de n�mero 1. Se o n�mero n�o corresponder a um dia da semana, mostre uma mensagem de erro.

package projetosjava03;
import java.util.Scanner;
public class Dia_da_semana {
    public static void main(String args[]) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Informe o n�mero do dia da semana.");
        int num = scan.nextInt();
        switch (num) {
            case 1 -> System.out.println("Domingo.");
            case 2 -> System.out.println("Segunda.");
            case 3 -> System.out.println("Ter�a.");
            case 4 -> System.out.println("Quarta.");
            case 5 -> System.out.println("Quinta.");
            case 6 -> System.out.println("Sexta.");
            case 7 -> System.out.println("S�bado.");
            default -> System.out.println("Dia inv�lido.");
        }
    }
}