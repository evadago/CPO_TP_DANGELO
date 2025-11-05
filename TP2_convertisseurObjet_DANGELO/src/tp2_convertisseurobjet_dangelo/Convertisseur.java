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
    int nbConversions;
    
    public Convertisseur () { 
        nbConversions = 0 ; 
    } 



    public double CelciusVersKelvin (double tCelcius) {
        nbConversions++;
        return((tCelcius+273.0));
    }
    public double KelvinVersCelcius (double tKelvin) {
        nbConversions++;
        return((tKelvin-273.0));
    }
    public double FarenheitVersCelcius (double tFarenheit) {
        nbConversions++;
        return(((tFarenheit-32.0)/1.8));
    }
    public double CelciusVersFarenheit (double tCelcius) {
        nbConversions++;
        return(((tCelcius*1.8)+32.0));
    }
    public double KelvinVersFarenheit (double tKelvin) {
        nbConversions++;
        return((CelciusVersFarenheit(KelvinVersCelcius(tKelvin))));
    }
    public double FarenheitVersKelvin (double tFarenheit) {
        nbConversions++;
        return((CelciusVersFarenheit(KelvinVersCelcius(tFarenheit))));
    }
    
    @Override 
    public String toString () { 
        return "nb de conversions "+ nbConversions; 
    }    
}
