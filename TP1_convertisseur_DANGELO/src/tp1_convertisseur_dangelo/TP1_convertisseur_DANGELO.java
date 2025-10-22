/*
 *TP1_convertisseur
 *Rôle : e réaliser un convertisseur de températures utilisant des méthodes
 *22/10/2025 
*/
package tp1_convertisseur_dangelo;

import java.util.Scanner;

/**
 *
 * @author evada
 */
public class TP1_convertisseur_DANGELO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valeur1;
        double Kelvin;
        System.out.println("Entrer un entier :");
        valeur1 = sc.nextDouble();
        System.out.println("La temperature en Kelvin est: " + (273+valeur1));
    }
    
}
