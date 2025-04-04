
package principal;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import java.util.Scanner;

public class mercado {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        String produto;
        double valor_unitario;
        double quantidade;
        String nome_cliente;
        int cpf;
        String opcao_cpf;
        double total;
        String pix;
        double total_pix;
        double tudo;
        
        System.out.println("digite qual foi o produto vc comprou ");
        produto = x.nextLine();

        System.out.println("Digite o valor do produto");
        valor_unitario = parseDouble(x.next());
        
        System.out.println("Digite a quantidade de produtos que vc comprou ");
        quantidade = parseDouble(x.next());
        
        System.out.println("O senhor(a) deseja CPF na nota ?");
        opcao_cpf = x.next();
        
        total = quantidade * valor_unitario;
        
        if("sim".equals(opcao_cpf)){
            System.out.println("Indique o nome do cliente");
            nome_cliente = x.next();
            System.out.println("Indique o CPF do cliente");
            cpf = parseInt(x.next());

            System.out.println("nome do cliente " +nome_cliente +" "+ "CPF do cliente "+cpf+" "+"\n O valor total da compra é de "+ total);
        }else{
            System.out.println("O total da compra é de "+ total);
        }
        
        System.out.println("O  cliente deseja realizar o pagamento no PIX?");
        pix = x.next();
        
        if("sim".equals(pix)){
            total_pix = total * 0.05;
            tudo = total - total_pix;
            System.out.println("o desconto recebido é de "+total_pix +". O total da compra ficou de " +tudo);
            
        }else{
            System.out.println("O total da compra ficou "+ total);
        }
        
        
        
        
    }
    
}
