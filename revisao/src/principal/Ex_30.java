
package principal;

import static java.lang.Double.parseDouble;
import java.util.Scanner;


public class Ex_30 {
    public static void main(String[] args) {
                Scanner x = new Scanner(System.in);
        
        double freq;
        
        System.out.println("digite a sua frequencia respiratoria");
        freq = parseDouble(x.next());
        
        if(freq < 12){
            System.out.println("BRADIPNEIA");
        }else if(freq >= 60 & freq <=100){
            System.out.println("EUPINEIA");
        }else{
            System.out.println("TAQUIPNEIA");
        }
        
    }
   }

