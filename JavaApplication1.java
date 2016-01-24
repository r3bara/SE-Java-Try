/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author smphe
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Machwas(1900);   
    }
    
    public static void Machwas(int JStart) {
        ArrayList<Integer> geeigneteJahre = new ArrayList<>(); 
        final java.util.Calendar today = java.util.Calendar.getInstance();
        final int todayYear = today.get(java.util.Calendar.YEAR);
        
        // Damit nur vierstellige eingaben möglich sind wird JStart auf 1000 gesetzt falls zu klein.
        if (JStart<1000) {
            JStart = 1000;
        }
        
        // Falls JStart größer ist als das aktuelle jahr wird es auch auf 1000 gesetzt.
        if (JStart>=todayYear) {
            JStart = 1000;
        }
        
        // Schleife zählt von Startjahr bis aktuelles Jahr hoch
        for (int i=JStart; i < todayYear; i++) {
            // Pruefen ob die Jahreszahl die gerade dran ist gleiche Zeichen enthält (mit Unterfunktion)
            if (DoppelteZahlEnthalten(i)) {
                // Wenn sie doppelte zahlen enthält ist sie nicht weiter wichtig
            }
            else {
                // sie ist eine zulässige zahl dann kommt sie in eine Liste
                geeigneteJahre.add(i);
            }
        }
        
        int maximaleDifferenz = 0;
        int JahrKlein = 0;
        int JahrGross = 0;
        // Jetzt ist die Liste "geeigneteJahre" befüllt.. jetzt laufe ich die durch und such die größte Jahresdifferenz aus
        for (int i=0; i<geeigneteJahre.size()-1; i++) {
            int temp_Differenz = geeigneteJahre.get(i+1) - geeigneteJahre.get(i) - 1;
            if (temp_Differenz>maximaleDifferenz) {
                maximaleDifferenz = temp_Differenz;
                JahrKlein = geeigneteJahre.get(i);
                JahrGross = geeigneteJahre.get(i+1);
            }
        }
        
        if (maximaleDifferenz == 0) {
            System.out.println("Keine Kombination gefunden");
        }
        else {
            System.out.println(JahrKlein + " - " + JahrGross + " => " + maximaleDifferenz);
        }
        
        
    }    
    
    public static boolean DoppelteZahlEnthalten(int i) {
        String str = Integer.toString(i);
        
        for (int j=0; j<4; j++) {
            for (int k=0; k<4; k++) {
                if (j != k) {
                    if (str.charAt(j) == str.charAt(k)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
