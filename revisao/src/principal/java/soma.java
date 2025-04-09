
package calculo;

import static java.lang.Double.parseDouble;
import java.util.Scanner;

public class soma {
    
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        
        double n1 = 0;
        double n2 = 0;
        double soma;
        double subtracao;
        double multiplicacao;
        double divisao;
        
        System.out.println("DIgite um numero: ");
        n1 = parseDouble(numero.next());
      
        
        System.out.println("Digite o segundo numero: ");
        n2 = parseDouble(numero.next());
        
      
        
        soma = n1 + n2;
        
        subtracao = n1 - n2;
        
        multiplicacao = n1 * n2;
        
        divisao = n1 / n2;
        
        System.out.println("A soma dos dois numeros é \n"+ soma+
                                 "\n A subtração dos dois numeros é \n"+ subtracao+
                                    "\n A multiplicao dos dois numeros é \n"+ multiplicacao+
                                        "\n A divisão dois numeros é \n"+divisao
                );
                
    }
    
}
