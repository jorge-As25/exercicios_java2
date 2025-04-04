
package principal;

import static java.lang.Double.parseDouble;
import java.util.Scanner;


public class Ex_26 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        double cate, peso;
        
        System.out.println("digite o peso do lutador ");
        peso = parseDouble(x.next());
        
        System.out.println("digite o peso maximo permitido pela categoria ");
        cate = parseDouble(x.next());
        
        if(peso > cate){
            System.out.println("O lutador esta com o peso acima do permitido pela sua categoria ");
        }else{
            System.out.println("o lutador esta com peso dentro do permitido permitido pela sua categoria");
        }
    }
    
}
