// Fa�a um programa que dada a idade de uma pessoa verifique sua classe eleitoral:
// * menor que 16 anos n�o pode votar;
// * com 16 ou 17 anos ou mais que 65 anos, votar � facultativo;
// * entre 18 e 65 anos (inclusive), votar � obrigat�rio.

package projetosjava02;
import java.util.Scanner;
public class Classe_eleitoral {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite sua idade:");
        int idade = scan.nextInt();
        if(idade < 16)
            System.out.println("Voc� n�o pode votar.");
        if(idade == 16 || idade == 17 || idade > 65)
            System.out.println("Votar � facultativo.");
        if(idade >= 18 && idade <= 65)
            System.out.println("Voc� deve votar.");
    }
}