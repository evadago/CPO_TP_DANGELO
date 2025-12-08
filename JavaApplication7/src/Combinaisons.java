/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Random;

/**
 *
 * @author evada
 */
public class Combinaisons {
    private int[] chiffres = new int[4]; // tableau de 4 chiffres
    
  

    public Combinaisons() {
        Random rand = new Random();
        for (int i = 0; i < chiffres.length; i++) {
            chiffres[i] = rand.nextInt(10); // nombre entre 0 et 9
        }
    }

    // Retourne la combinaison complète
    public int[] getChiffres() {
        return chiffres;
    }

    // Vérifie si une tentative correspond à la combinaison
    public boolean verifier(int[] tentative) {
        if (tentative.length != chiffres.length) return false;
        for (int i = 0; i < chiffres.length; i++) {
            if (tentative[i] != chiffres[i]) return false;
        }
        return true;
    }

    
    
    
    
}
