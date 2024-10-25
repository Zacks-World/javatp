import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner scanner=new Scanner(System.in);
        System.out.print("Entrer le verbe : ");
        String Verbe=scanner.next();
        String[] Pronoms={"je","tu","il/elle/on","nous","vous","ils/elles" };
        String[] Terminaison={"e","es","e","ons","ez","ent"};
        String[] Aller={"vais","vas","va","allons","allez","vont"};
        Verbe=Verbe.toLowerCase();
        if(Verbe.endsWith("er"))
        {
            for (int i = 0; i < 6; i++) {
                if (Verbe.equals("aller"))
                {
                    System.out.println("\n"+Pronoms[i]+" "+Aller[i]);
                }
                else{
                    System.out.println(Pronoms[i]+" "+Verbe.substring(0,Verbe.length()-2)+Terminaison[i]);
                }

            }

        }
        else {
            System.out.println(Verbe+" n'est pas un verbe regulier");
        }

    }
}