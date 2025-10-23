/*
 *TP1_guessMyNumber
 *Rôle : réaliser un jeu de type « Guess My Number » : un nombre aléatoire est choisi, l’utilisateur doit le deviner
 *24/10/2025 
*/
package tp1_guessmynumber_dangelo;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author evada
 */
public class TP1_guessMyNumber_DANGELO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random generateurAleat = new Random();
        int n = generateurAleat.nextInt(100);
        Scanner sc = new Scanner(System.in);
        int nombre;
        int compteur=1;
        int niveau;
        int Essais=0;
        int maxEssais=0;
        System.out.println(" Saisissez le niveau de difficulte souhaite ");
        System.out.println(" 1) Facile");
        System.out.println(" 2) Normal");
        System.out.println(" 3) Difficile");
        niveau= sc.nextInt();
        System.out.println("Saisissez un nombre entre 0 et 100 ");
        nombre = sc.nextInt();
        if (niveau == 1) {
            maxEssais = 10;
        } else if (niveau == 2) {
            maxEssais = 7 ;
        } else if (niveau == 3) {
            maxEssais = 4;
        }
        while(nombre != n && Essais < maxEssais-1){ 
            Essais++;
            compteur++;
            if (nombre < n) {
                System.out.println("Trop petit !");
            } else if (nombre > n) {
                System.out.println("Trop grand !");
            }
            System.out.print("Entrez un nouveau nombre : ");
            nombre = sc.nextInt();
        }
        if (nombre == n) {
        System.out.println("Gagne");
        } else {
            System.out.println("Perdu");
        }
        System.out.println(compteur);

        
    }
    
}
