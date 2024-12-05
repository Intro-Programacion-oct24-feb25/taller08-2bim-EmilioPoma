/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problemas;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
            entrada.useLocale(Locale.US);
            int contador = 0;
            double gradosF;
            double gradosC;
            String cadena = "";
       
            for(gradosF = 20; gradosF <= 100; gradosF += 4){
                gradosC = (5.0/9.0)*(gradosF - 32);
                cadena = String.format("%s\nOperación(%d) Fahrenheit: %.2f ===> Celcius: %.2f", cadena, contador, gradosF, gradosC);
                contador += 1;
           
           
          }
            System.out.println(cadena);
    }
    
}
