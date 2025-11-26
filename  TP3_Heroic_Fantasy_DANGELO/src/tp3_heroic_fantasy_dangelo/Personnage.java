/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_dangelo;

/**
 *
 * @author evada
 */
public abstract class Personnage {
    String nom;
    int ndv;
    
    public Personnage(String nom, int ndv){
        this.nom = nom;
        this.ndv = ndv;
    }
    
    @Override
    public String toString() {
        return"Le nom du personnage est "+nom+" et son niveau de vie est "+ndv;
    }
    
}
