/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author evada
 */
public class Question {
    
    private String intitule; 
    private String P1; 
    private String P2; 
    private String P3; 
    private String P4; 
    private int indexBonneReponse; 

    public Question(String intitule, String p1, String p2, String p3, String p4, int indexBonneReponse) {
        this.intitule = intitule;
        this.P1 = P1;
        this.P2 = P2;
        this.P3 = P3;
        this.P4 = P4;
        this.indexBonneReponse = indexBonneReponse;
        
        if (indexBonneReponse < 1) indexBonneReponse = 1 ;
        if (indexBonneReponse > 4) indexBonneReponse = 4 ;
    }

    public String getIntitule() {
        return intitule;
    }
    public String getP1() {
        return P1;
    }
    public String getP2() {
        return P2;
    }
    public String getP3() {
        return P3;
    }
    public String getP4() {
        return P4;
    }
    public int getIndexBonneReponse() {
        return indexBonneReponse;
    }
    
    
    
    
}
