/*
TP0_Calculette
Rôle : calculer le résultat de l’opération impliquant les 2 opérandes et l’opérateur sélectionne
20/10/2025 
 */
package tp0_calculette;

import java.util.Scanner;

/**
 *
 * @author evada
 */
public class TP0_Calculette {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int operateur;
        float operande1;
        float operande2;
        System.out.println(" Please enter the operator: ");
        System.out.println(" 1) add ");
        System.out.println(" 2) substract ");
        System.out.println(" 3) multiply ");
        System.out.println(" 4) divide ");
        System.out.println(" 5) modulo ");
        System.out.println("Entrer un chiffre :");
        operateur = sc.nextInt();
        System.out.println("Entrer une valeur :");
        operande1 = sc.nextInt();
        System.out.println("Entrer une valeur :");
        operande2 = sc.nextInt();
        if (operateur == 1) {
            System.out.println("Le resultat est" + (operande1 + operande2));
        } else if (operateur == 2) {
            System.out.println("Le resultat est" + (operande1 - operande2));
        } else if (operateur == 3) {
            System.out.println("Le resultat est" + (operande1 * operande2));
        } else if (operateur == 4) {
            System.out.println("Le resultat est" + (operande1 / operande2));
        } else if (operateur == 5) {
            System.out.println("Le resultat est" + (operande1 % operande2));
        }
    }
}