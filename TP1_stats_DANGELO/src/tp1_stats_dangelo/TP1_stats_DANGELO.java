/*
 *TP1_stats
 *Rôle : vérifier si la distribution de nombres du générateur de nombre aléatoire est bien aléatoire
 *24/10/2025 
*/
package tp1_stats_dangelo;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author evada
 */
public class TP1_stats_DANGELO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random generateurAleat = new Random();
        int [] tab;
        int m;
        int a=0;
        tab = new int [6];
        System.out.println("Saisissez un nombre entier");
        m = sc.nextInt();
        while (a < m && a < tab.length) {
            tab[a] = generateurAleat.nextInt(5);
            System.out.print(tab[a]);
            a++;
        }


    }
    
}
