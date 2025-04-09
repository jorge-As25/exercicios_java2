
package exercicios;

import static java.lang.Double.parseDouble;
import java.util.Scanner;

public class Ex_12 {
    
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        double cm, m;
        
        System.out.println("Digite o valor em cm ");
        cm = parseDouble(x.next());
        
        m = cm/100;
        
        System.out.println("o valor em metros é de " + m);
        
    }
    
}
