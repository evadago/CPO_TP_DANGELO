/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_dangelo;

/**
 *
 * @author evada
 */
public class Magicien extends Personnage {
    
    boolean confirme;
    
    public Magicien(String nom, int ndv, boolean confirme) {
        super(nom, ndv);
    }

    public void setConfirme(boolean confirme) {
        this.confirme = confirme;
    }
    
    
}
