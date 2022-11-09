/*
Realize um programa que dever� receber de v�rios usu�rios nome, sexo, idade e dever� informar sua faixa et�ria seguindo: 

Jovens - Indiv�duos de at� 19 anos; 
Adultos - Indiv�duos com idade entre 20 at� 59 anos; 
Idosos - Indiv�duos de 60 anos em diante. 

No final sair� "Fulano voc� pertence a faixa et�ria de: " 
*/

package projetosjava05;
import java.util.Scanner;
public class Idade {
    void clean() {
        for(int i = 0; i < 100; i++)
            System.out.println();
    }
    public static void main(String args[]) {
        Idade console = new Idade();
        Scanner scan = new Scanner(System.in);
        console.clean();
        while (true) {
            System.out.print("Escreva seu nome: ");
            String nome = scan.nextLine();
            System.out.print("Escreva seu sexo: ");
            char sexo = scan.next().charAt(0);
            System.out.print("Escreva sua idade: ");
            int idade = scan.nextInt();
            System.out.print(nome + " pertence a faixa et�ria de: ");
            if(idade <= 19)
                System.out.println("Jovem \n");
            if(idade >= 20 && idade <= 59)
                System.out.println("Adulto \n");
            if(idade >= 60)
                System.out.println("Idoso \n");
            scan.nextLine();
        }
    }
}
