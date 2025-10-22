/*
TP0_HelloWorld
Rôle : se familiariser avec l’environnement Netbeans
20/10/2025
*/
package tp0_.helloworld;

import java.util.Scanner;

/**
 *
 * @author evada
 */
public class TP0_HelloWorld {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        String prenom;
        Scanner sc ;
        sc = new Scanner (System.in) ;
        System.out.println( " Bonjour " ) ; 
        System.out.println("Quel est votre prenom ?");
        System.out.println( " Au revoir " ) ; 
        prenom = sc.nextLine(); 
    }
    
}
