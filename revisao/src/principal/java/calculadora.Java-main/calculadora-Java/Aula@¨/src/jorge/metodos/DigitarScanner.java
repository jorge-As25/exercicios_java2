
package jorge.metodos;

import java.util.Scanner;

public class DigitarScanner {
    
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        
        System.out.println("Digite o primeiro valor");
        int valor1 = x.nextInt();
        
        System.out.println("Digite o segundo valor");
        int valor2 = x.nextInt();
        
        int soma = valor1 + valor2;
        
        int subtracao = valor1 - valor2;
        
        int multiplicacao = valor1 * valor2;
                
        int divisao = valor1/valor2;
        
        System.out.println("O valor da soma é de: " + soma);
        System.out.println("O valor da subtração é de: " + subtracao);
        System.out.println("O valor da multiplicação é de: " + multiplicacao);
        System.out.println("O valor da divisão é de: " + divisao);
         
    }
    
}
