
package varazslo_harcos_jatek;

import java.util.Random;

public class Varazslo_harcos_jatek {

    public static void main(String[] args) {
        System.out.println("Kezdés:");
        System.out.println("    H _ V");
        System.out.println("    H:9  V:9");
        Random rnd = new Random();
        int harcosh,varazsloh;
        int eleth=9, eletv=9;
        for (int i = 1; i <= 3; i++) {
            System.out.println(i+". kör:");
            harcosh=rnd.nextInt(1,3);
            varazsloh=rnd.nextInt(1,3);
       String mezo1 = harcosh == 1 ? "H":"_";
       String mezo2 = harcosh == 2 ? "H":"_";
       String mezo3 = harcosh == 3 ? "H":"_";
        
        mezo1 = varazsloh == 1 ? "V":mezo1;
        mezo2 = varazsloh == 2 ? "V":mezo2;
        mezo3 = varazsloh == 3 ? "V":mezo3;
        
        if (varazsloh == harcosh) {
        mezo1 = varazsloh == 1 ? "X":mezo1;
        mezo2 = varazsloh == 2 ? "X":mezo2;
        mezo3 = varazsloh == 3 ? "X":mezo3;
        eleth-= rnd.nextInt(1,6);
        eletv-= rnd.nextInt(1,6);
        
        }
        
        System.out.println("    "+mezo1+" "+mezo2+" "+mezo3);
        System.out.println("    H:"+eleth+" V:"+eletv);
        }
        
    }
    
}
