// Ler 3 valores (considere que n�o ser�o informados valores iguais) e escrev�-los em ordem crescente.

// Meu jeito:


package projetosjava01;
import java.util.Scanner;
public class Ler_3_valores {
    public static void main(String args[]) {
        Scanner scan = new Scanner (System.in);
        int ordem1 = 0, ordem2 = 0, ordem3 = 0;
        System.out.println("Digite 3 N�meros:");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        // Posi��o do 1� n�mero.
        if (num1 <= num2 && num1 <= num3)
            ordem1 = num1;
        if (num1 >= num2 && num1 <= num3)
            ordem2 = num1;
        if (num1 <= num2 && num1 >= num3)
            ordem2 = num1;
        if (num1 >= num2 && num1 >= num3)
            ordem3 = num1;
        // Posi��o do 2� n�mero.
        if (num2 <= num1 && num2 <= num3)
            ordem1 = num2;
        if (num2 >= num1 && num2 <= num3)
            ordem2 = num2;
        if (num2 <= num1 && num2 >= num3)
            ordem2 = num2;
        if (num2 >= num1 && num2 >= num3)
            ordem3 = num2;
        // Posi��o do 3� n�mero.
        if (num3 <= num2 && num3 <= num1)
            ordem1 = num3;
        if (num3 >= num2 && num3 <= num1)
            ordem2 = num3;
        if (num3 <= num2 && num3 >= num1)
            ordem2 = num3;
        if (num3 >= num2 && num3 >= num1)
            ordem3 = num3;
        System.out.println(ordem1 + " " + ordem2 + " " + ordem3);
    }
}


// Jeiro mais legal:

/*
package projetosjava;
import java.util.Scanner;
public class Ler_3_valores {
    public static void main(String args[]) {
        Scanner scan = new Scanner (System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        if (num1 <= num2 && num1 <= num3) {
            if (num2 <= num3) {
                System.out.println(num1 + " " + num2 + " " + num3);
            } else {
                System.out.println(num1 + " " + num3 + " " + num2);
            }
        } if (num2 <= num1 && num2 <= num3) {
            if (num1 <= num3) {
                System.out.println(num2 + " " + num1 + " " + num3);
            } else {
                System.out.println(num2 + " " + num3 + " " + num1);
            }
        } else {
            if (num1 <= num2) {
                System.out.println(num3 + " " + num1 + " " + num2);
            } else {
                System.out.println(num3 + " " + num2 + " " + num1);
            }
        }
    }
}
*/

// Mais um jeito:

/*
package projetosjava;
import java.util.Scanner;
public class Ler_3_valores {
    public static void main(String args[]) {
        Scanner scan = new Scanner (System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        if (num1 < num2 && num2 < num3)
            System.out.println(num1 + " " + num2 + " " + num3);
        if (num1 < num3 && num3 < num2)
            System.out.println(num1 + " " + num3 + " " + num2);
        if (num2 < num1 && num1 < num3)
            System.out.println(num2 + " " + num1 + " " + num3);
        if (num2 < num3 && num3 < num1)
            System.out.println(num2 + " " + num3 + " " + num1);
        if (num3 < num2 && num2 < num1)
            System.out.println(num3 + " " + num2 + " " + num1);
        if (num3 < num1 && num1 < num2)
            System.out.println(num3 + " " + num1 + " " + num2);
    }
}
*/