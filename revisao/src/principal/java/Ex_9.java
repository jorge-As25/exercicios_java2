
package exercicios;

import static java.lang.Double.parseDouble;
import java.util.Scanner;


public class Ex_9 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        double litros,mili;
        
        System.out.println("Digite a quantidade de litros ");
        litros = parseDouble(x.next());
        
        mili = litros * 1000;
        
        System.out.println("A conversão para mililitros é de "+mili);
    }
    
}
