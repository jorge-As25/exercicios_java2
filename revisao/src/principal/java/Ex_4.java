
package exercicios;

import static java.lang.Double.parseDouble;
import java.util.Scanner;


public class Ex_4 {
    public static void main(String[] args) {
        Scanner agua = new Scanner(System.in);
        double peso = 0,qtdAgua;
        
        System.out.println("Digite o seu peso ");
        peso = parseDouble(agua.next());
        
        qtdAgua = peso * 0.040;
        
        System.out.println("A quantidade de agua que vc precisa beber durante o dia é de "+ qtdAgua);
        
        
    }
    
}
