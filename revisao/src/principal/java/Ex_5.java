
package exercicios;

import static java.lang.Double.parseDouble;
import java.util.Scanner;


public class Ex_5 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        double peso,altura,imc;
        
        System.out.println("digite o seu peso ");
        peso = parseDouble(x.next());
        
        System.out.println("Digite a sua altura ");
        altura = parseDouble(x.next());
        
        imc = peso/(altura*altura);
        
        System.out.println(imc);
        
    }
}