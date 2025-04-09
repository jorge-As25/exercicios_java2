
package exercicios;

import static java.lang.Double.parseDouble;
import java.util.Scanner;


public class Ex_1 {
    
    public static void main(String[] args) {
        Scanner mat = new Scanner(System.in);
        
        double n1, n2, res;
        
        
        System.out.println("Digite o primeiro numero ");
        n1 = parseDouble(mat.next());
        
        System.out.println("DIgite o segundo numero ");
        n2 = parseDouble(mat.next());
        
        res = (n1 + n2) * n1;
        System.out.println("O resultado da equação é de " + res);
        
    }
    
}
