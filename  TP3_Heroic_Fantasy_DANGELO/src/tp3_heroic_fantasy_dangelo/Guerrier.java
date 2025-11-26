/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_dangelo;

/**
 *
 * @author evada
 */
public class Guerrier extends Personnage {
    
    boolean cheval;
    
    public Guerrier(String nom, int ndv, boolean cheval) {
        super(nom, ndv);
    }

    public void setCheval(boolean cheval) {
        this.cheval = cheval;
    }
    
    
    
    
}
