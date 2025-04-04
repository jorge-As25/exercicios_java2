
package principal;

import static java.lang.Double.parseDouble;
import java.util.Scanner;


public class Ex_29 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        double freq;
        
        System.out.println("digite a sua frequencia cardiaca");
        freq = parseDouble(x.next());
        
        if(freq < 60){
            System.out.println("BRAQUICARDIA");
        }else if(freq >= 60 & freq <=100){
            System.out.println("NORMOCADIA");
        }else{
            System.out.println("TAQUICARDIA");
        }
        
    }
    
}
