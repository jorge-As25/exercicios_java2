
package exercicios;

import static java.lang.Double.parseDouble;
import java.util.Scanner;


public class Ex_3 {
    
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        double nasc, idade;
        
        System.out.println("Digite o ano em que você nasceu ");
        nasc = parseDouble(data.next());
        
        idade = 2025 - nasc;
        System.out.println("A sua idade é " + idade);
        
    }
    
}
