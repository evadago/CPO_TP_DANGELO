/*
 *TP1_manipNombreInt
 *Rôle : Saisie et manipulation de nombres 
 *22/10/2025 
 */
package tp1_manipnombreint_dangelo;

import java.util.Scanner;

/**
 *
 * @author evada
 */
public class TP1_manipNombreInt_DANGELO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int entier1;
        int entier2;
        int somme;
        System.out.println("Entrer un entier :");
        entier1 = sc.nextInt();
        System.out.println("Entrer une entier :");
        entier2 = sc.nextInt();
        System.out.println("La somme est " + (entier1 + entier2));
        System.out.println("La difference est " + (entier1 - entier2));
        System.out.println("Le produit est " + (entier1 * entier2));
        System.out.println("Le resultat est " + (entier1 / entier2));
        System.out.println("Le resultat est " + (entier1 % entier2));
        }
    }
    
