
package exercicios;

import static java.lang.Double.parseDouble;
import java.util.Scanner;

public class Ex_8 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        double n1, n2,soma, sub,mult,div;
        
        System.out.println("Digite o primeiro numero ");
        n1 = parseDouble(x.next());
        
        System.out.println("Digite o seegundo numero ");
        n2 = parseDouble(x.next());
        
        soma = n1 + n2;
        sub = n1 - n2;
        mult = n1 * n2;
        div = n1 / n2;
        
        System.out.println("O valor da soma é de: " + soma);
        System.out.println("O valor da subtração é de: " + sub);
        System.out.println("O valor da multiplicação é de: " + mult);
        System.out.println("O valor da divisão é de: " + div);
        
        
        
    }
}
