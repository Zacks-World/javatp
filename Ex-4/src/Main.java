import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] Nb_Occur=new int[26];
        System.out.print("Entrer une chaine de caractères : ");
        //nextLine Pour lire toute la ligne
        String Ch=scanner.nextLine().toLowerCase();
        for (int i=0;i<Ch.length();i++) {
            char c=Ch.charAt(i);
            if (c >='a'&&c<='z') {
                //Calculer l'index correspondant dans le tableau (0 pour 'a', 25 pour 'z')
                int index=c-'a';
                Nb_Occur[index]++;
            }
        }
        System.out.println("la chaîne "+ Ch +" contient :");
        for (int i=0;i<Nb_Occur.length;i++) {
            if (Nb_Occur[i]>0) {
                // Convertir l'index en lettre ('a' + i donne la lettre)
                char lettre=(char) (i + 'a');
                System.out.println(Nb_Occur[i] +" fois la lettre "+lettre);
            }
        }
        scanner.close();
    }
}