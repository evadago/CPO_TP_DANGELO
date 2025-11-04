/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_dangelo;

/**
 *
 * @author evada
 */
public class Convertisseur {
    float temperature;
    float operateur;

    
    public Convertisseur(float conversion){
    operateur = conversion; 
    }
    int nbConversions;
    float CelciusVersKelvin;
    float KelvinVersCelcius;
    float FarenheitVersKelvin;
    float KelvinVersFarenheit;
    float FarenheitVersCelcius;
    float CelciusVersFarenheit;
    if (operateur == 1) {
            T = (CelciusVersKelvin(temperature);
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
    public Convertisseur () { 
        nbConversions = 0 ; 
    } 
    @Override 
    public String toString () { 
        return "nb de conversions"+ nbConversions; 
    } 

    float temperature;
    float operateur;

    
    public Convertisseur(float T, float conversion){
    temperature = T; 
    operateur = conversion; 
    }
    
    public void lireConversion(){
      System.out.println("La temperature est " + T) ;        
    }
}
