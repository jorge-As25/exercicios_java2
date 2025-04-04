
package principal;

import static java.lang.Double.parseDouble;
import java.util.Scanner;

public class Ex_28 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        
        double aulas,freq,aluno;
        
        System.out.println("digite a quantidades  de aulas que vc deu esse semestre ");
        aulas = parseDouble(x.next());
        
       freq = aulas * 0.75;
       
       System.out.println("A quantidade de frquencia que o aluno precisa ter é de "+ freq);
       
       System.out.println("digite a quantidade de frequencia do aluno ");
       aluno = parseDouble(x.next());
       
       if(aluno < freq){
           System.out.println("ALUNO RETIDO POR EXCERDER O NUMERO DE FALTAS ");
       }else{
           System.out.println("ALUNO APROVADO");
       }
    }
    
}
