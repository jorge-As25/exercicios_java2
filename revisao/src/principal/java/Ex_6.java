
package exercicios;

import static java.lang.Double.parseDouble;
import java.util.Scanner;


public class Ex_6 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        double salario = 4500;
        double br = 200, n;
        double sf;
        
        System.out.println("Digite o numero de bugs resulvidos por vc nesse mes ");
        n = parseDouble(x.next());
        
        sf = salario + (n*br);
        
        System.out.println(sf);
        
        
    }
}
