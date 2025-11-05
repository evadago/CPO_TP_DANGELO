/*
 *TP2_manip
 *Rôle : Manipulation des objets (par leur référence)
 *05/11/2025 
*/

/**
 *
 * @author evada
 */
public class TP2_manip_DANGELO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tartiflette assiette1 = new Tartiflette(500) ; 
        Tartiflette assiette2 = new Tartiflette(600) ; 
        Tartiflette assiette3 = assiette2 ; 
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories) ; 
        System.out.println("nb de calories de Assiette 3 : " + 3.nbCalories) ; 
    }
    
}
