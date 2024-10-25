import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner scanner=new Scanner(System.in);
        int choix;
        String Chaine="";
        do {
            System.out.printf("\n1. saisir\n" + "2. afficher\n" + "3. inverser.\n" + "4. Nombre de mots\n" +"5.Quitter");
            System.out.printf("\nChoisis une operation : ");
            choix=scanner.nextInt();
            scanner.nextLine();
            switch (choix) {
                case 1:
                    System.out.print("Entrer une chaine de caractere : ");
                    Chaine = scanner.nextLine(); // Lire correctement la chaîne
                    break;
                case 2:
                    if (Chaine.isEmpty()) {
                        System.out.println("Aucune chaîne n'a été saisie.");
                    }
                    else
                    System.out.println(Chaine);
                    break;
                case 3:
                    if (Chaine.isEmpty()) {
                        System.out.println("Aucune chaîne n'a été saisie.");
                    }
                    else {
                        char[] Char = Chaine.toCharArray();
                        String rev = "";
                        for (int i = Chaine.length() - 1; i >= 0; i--) {
                            rev += Char[i];
                        }
                        System.out.println(rev);
                    }
                    break;
                case 4:
                    if (Chaine.isEmpty()) {
                        System.out.println("Aucune chaîne n'a été saisie.");
                    }
                    else {
                        // Supprimer les espaces en début et fin de chaîne, et diviser par les espaces
                        String[] mots = Chaine.trim().split("\\s+");
                        System.out.println("Nombre de mots : " + mots.length);
                    }
                    break;
                case 5:
                    System.out.println("Bye!!!");
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
            }
            if(choix<5 && choix>0) {
                System.out.println("Frappez une touche pour revenir au menu.");
                scanner.nextLine(); // Attendre que l'utilisateur appuie sur une touche
            }
        }while (choix!=5);
        scanner.close();


    }
}