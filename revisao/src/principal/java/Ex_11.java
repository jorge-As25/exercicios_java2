
package exercicios;

import static java.lang.Double.parseDouble;
import java.util.Scanner;


public class Ex_11 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        double m, cm;
        
        System.out.println("Digite o valor em metros ");
        m = parseDouble(x.next());
        
        
        cm = m * 100;
        
        System.out.println("o valor em cm é de " + cm);
        
        
        
    }
    
}
