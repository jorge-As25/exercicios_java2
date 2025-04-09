
package exercicios;

import static java.lang.Double.parseDouble;
import java.util.Scanner;

public class Ex_10 {
       public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        double litros,mili;
        
        System.out.println("Digite a quantidade em mililitros ");
        mili = parseDouble(x.next());
        
        litros = mili/1000;
        
        System.out.println(mili);
    }
}
