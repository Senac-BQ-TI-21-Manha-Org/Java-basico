// Ler 2 valores e imprimir uma das tr�s mensagens a seguir: "N�meros iguais" caso os n�meros sejam iguais,
// "Primeiro � maior" caso o primeiro seja maior que o segundo, "Segundo � maior" caso o segundo seja maior que o primeiro.

package projetosjava01;
import java.util.Scanner;
public class Dois_n�meros_igual_maior_menor {
    public static void main(String args[]) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Infoeme 2 n�meros.");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        if(num1 > num2)
            System.out.println("O 1� n�mero � maior.");
        if(num1 < num2)
            System.out.println("O 2� n�mero � maior.");
        if(num1 == num2)
            System.out.println("Ambos s�o n�mero iguais.");
    }
}