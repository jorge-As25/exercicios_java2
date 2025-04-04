
package principal;

import static java.lang.Double.parseDouble;
import java.util.Scanner;


public class Ex_25 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        double velocidade;
        
        System.out.println("Digite a velocidade que vc estava dirigindo");
        velocidade = parseDouble(x.next());
        
        if(velocidade > 90){
            System.out.println("REGISTRO DE INFRAÇÃO POR EXCESSO DE VELOCIDADE AO PERMITIDO NA VIA ");
        }else{
            System.out.println("VELOCIDADE DO AUTOMOVEL ESTA ABAIXO DO LIMITE DA VIA");
        }

    } 
}
