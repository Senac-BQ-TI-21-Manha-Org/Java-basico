// Escreva um programa que imprima n�meros de 3 em 3 de 1 at� 100.

package projetosjava03;
public class Tr�s_em_tr�s {
    public static void main(String args[]) {
        System.out.println("Ordem crescente (de 3 em 3):");
        for (int i = 1; i <= 99; i++) {
            System.out.println(i + " ");
            i++;
            i++;
        }
    }
}