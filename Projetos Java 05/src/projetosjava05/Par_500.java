/*
Fa�a um programa que informe a quantidade de n�meros pares no intervalo de 1 a 500. 
*/

package projetosjava05;
public class Par_500 {
    public static void main(String args[]) {
        int num = 0;
        for(int i = 1; i <= 500; i++)
            if(i % 2 == 0) {
                System.out.println(i);
                num++;
            }
        System.out.println("\nTotal de n�meros par: " + num);
    }
}
