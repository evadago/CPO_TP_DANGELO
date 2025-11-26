/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author evada
 */
public abstract class Arme {
    int niveau_attaque;
    String Nom;
    
    public Arme(String nom, int niveau) {
        Nom = nom;
        
        if(niveau_attaque>100){
            niveau=100;
        }else if(niveau_attaque<0){
            niveau=0;
        }else{
            niveau_attaque = niveau;
        }
    }
    
    public int getNiveauAttaque() {
        return niveau_attaque ;
    }
    
    public String getNom() {
        return Nom ;
    }
    
    @Override
    public String toString() {
        return "Son nom est "+Nom+" et son niveau est "+niveau_attaque;
    }
    
}
