/*
Crie um programa que tenha definido :

String ditado1 = ?�guas moinho n�o movem passadas";
String ditado2 = "Cada galho no seu macaco";
String ditado3 = "De louco e m�dico, todo mundo tem um pouco";
String ditado4 = "Como dizia Chapolin colorado ";
String ditado5 = "Deus madruga a quem cedo ajuda";
*/

package projetosjava06;
import java.util.ArrayList;
public class Chapolin {
    public static void main(String[] args) {
        String ditado1 = "�guas moinho n�o movem passadas", ditado2 = "Cada galho no seu macaco", ditado3 = "De louco e m�dico, todo mundo tem um pouco", ditado4 = "Como dizia Chapolin colorado", ditado5 = "Deus madruga a quem cedo ajuda";
        ArrayList ditado = new ArrayList();
        ditado.add(ditado1);
        ditado.add(ditado2);
        ditado.add(ditado3);
        ditado.add(ditado4);
        ditado.add(ditado5);
        System.out.println(ditado);
        ditado.remove(2);
        System.out.println(ditado);
    }
}
