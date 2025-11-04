/*
 *TP2_Bieres
 *Rôle : Création d’une première classe et de quelques objets associés
 *03/11/2025 
*/
package tp2_bieres_dangelo;

/**
 *
 * @author evada
 */
public class TP2_Bieres_DANGELO {

    /**
     * @param args the command line arguments
     */
    
    //BouteilleBiere uneBiere = new BouteilleBiere() ;
    //uneBiere.nom = "Cuvee des trolls"; 
    //uneBiere.degreAlcool = 7.0 ; 
    //uneBiere.brasserie = "Dubuisson";
    //uneBiere.ouverte = false;
    //uneBiere.lireEtiquette();
    //BouteilleBiere unesecondBiere = new BouteilleBiere() ;
    //unesecondBiere.nom = "Leffe";
    //unesecondBiere.degreAlcool = 6.6;
    //unesecondBiere.brasserie = "Abbaye de Leffe";
    //unesecondBiere.lireEtiquette();
    public static void main(String[] args) {
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvee des trolls", 7.0 ,"Dubuisson") ;
        BouteilleBiere unesecondBiere = new BouteilleBiere("Leffe", 6.6 ,"Abbaye de Leffe") ; 
        BouteilleBiere unetroisBiere = new BouteilleBiere("Ciel", 6.8 ,"Bordeaux") ; 
        BouteilleBiere unequatreBiere = new BouteilleBiere("Amour", 6.0 ,"Provence") ; 
        BouteilleBiere unecinqBiere = new BouteilleBiere("jeu", 8.0 ,"Marseille") ; 
        uneBiere.lireEtiquette();
        unesecondBiere.lireEtiquette();
        unetroisBiere.lireEtiquette();
        unequatreBiere.lireEtiquette();
        unecinqBiere.lireEtiquette();
        System.out.println(uneBiere) ; 
        
    }
    
}
