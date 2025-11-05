package tp2_manip_dangelo;

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
        
        assiette2 = assiette1;
        assiette1 = assiette3;
                
        System.out.println("nb de calories de Assiette 2 : " + assiette1.nbCalories) ; 
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories) ; 
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories) ; 
       
        Moussaka[] reference = new Moussaka[10];
        
     
        
        for (int i = 0; i < reference.length; i++) {
            reference[i] = new Moussaka(400+i*10);
            System.out.println("Référence #" + (i+1) + " :");
            System.out.println("Moussaka " + i + " : " + reference[i].nbCalories + " calories" );
        }
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories) ; 
    }
    
}
