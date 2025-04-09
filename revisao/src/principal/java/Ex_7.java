
package exercicios;

import static java.lang.Double.parseDouble;
import java.util.Scanner;


public class Ex_7 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        double sm = 2000, sf;
        double cv = 100;
        double n;
        
        System.out.println("Digite o numero de carros que vc vendeu esse mes ");
        n = parseDouble(x.next());
        
        sf = sm + (cv*n);
        
        System.out.println(sf);
        
        
    }
}
