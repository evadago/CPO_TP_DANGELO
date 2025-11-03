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
        if (operateur == 1) {
            System.out.println("La temperature est " + (CelciusVersKelvin(temperature)));
        } else if (operateur == 2) {
            System.out.println("La temperature est " + (KelvinVersCelcius(temperature)));
        } else if (operateur == 3) {
            System.out.println("La temperature est " + (FarenheitVersKelvin(temperature)));
        } else if (operateur == 4) {
            System.out.println("La temperature est " + (KelvinVersFarenheit(temperature)));
        } else if (operateur == 5) {
            System.out.println("La temperature est " + (FarenheitVersCelcius(temperature)));
        } else if (operateur == 6) {
            System.out.println("La temperature est " + (CelciusVersFarenheit(temperature)));
        }
    }
    public static double CelciusVersKelvin (double tCelcius) {
        return((tCelcius+273));
    }
    public static double KelvinVersCelcius (double tKelvin) {
        return((tKelvin-273));
    }
    public static double FarenheitVersCelcius (double tFarenheit) {
        return(((tFarenheit-32)/1.8));
    }
    public static double CelciusVersFarenheit (double tCelcius) {
        return(((tCelcius*1.8)+32));
    }
    public static double KelvinVersFarenheit (double tKelvin) {
        return((CelciusVersFarenheit(KelvinVersCelcius(tKelvin))));
    }
    public static double FarenheitVersKelvin (double tFarenheit) {
        return((CelciusVersFarenheit(KelvinVersCelcius(tFarenheit))));
    }
    
    
}
