/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author evada
 */
public class Epee extends Arme {
    int Finesse;
    
    public Epee(String nom, int niveau, int finesse){
        super(nom,niveau);
        
        if(Finesse>100){
            finesse=100;
        }else if(Finesse<0){
            finesse=0;
        }else{
            Finesse=finesse;
        }
    }
    
    public int getFinesse() {
        return Finesse ;
    }
    
}
