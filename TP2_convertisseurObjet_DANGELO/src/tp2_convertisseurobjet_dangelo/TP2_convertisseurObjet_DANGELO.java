/*
 *TP2_convertisseurObjet
 *Rôle : réalisation d'un convertisseur de températures en version objet
 *04/11/2025 
*/
package tp2_convertisseurobjet_dangelo;

import java.util.Scanner;

/**
 *
 * @author evada
 */
public class TP2_convertisseurObjet_DANGELO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int operateur;
        double temperature;
        System.out.println("Entrer une valeur :");
        temperature = sc.nextDouble();
        System.out.println(" Saisissez la conversion que vous souhaiter effectuer: ");
        System.out.println(" 1) De Celcius vers Kelvin ");
        System.out.println(" 2) De Kelvin vers Celcius  ");
        System.out.println(" 3) De Farenheit vers Kelvin ");
        System.out.println(" 4) De kelvin vers Farenheit ");
        System.out.println(" 5) De Farenheit vers Celcius ");
        System.out.println(" 6) De Celcius vers Farenheit ");
        operateur = sc.nextInt();
        Convertisseur temperature = new Convertisseur(operateur);
    }
    
}
