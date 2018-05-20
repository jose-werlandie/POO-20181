
package questao_3;

import java.util.Scanner;

public class Questao_3 {
    
     public static void main(String[] args){
        Scanner scan = new Scanner( System.in );

        int n1      = 0, n2= 0;
        int Mat     = 0;
        double Mar  = 0;
        int con     = 0;

        while(con < 50){
            System.out.println("nome ;");
            String nome;
            nome = scan.nextLine();
            System.out.println("nota 1 ;");
            n1 = scan.nextInt();
            System.out.println("nota 2; ");
            n2 = scan.nextInt();

            if ( n1 == 0 || n2 == 0){
                System.out.println("TUrma não merece ter mais média computada");
                break;
            }else{
                Mar = ( n1 + n2)/2;
                Mat = (int)Mar;
                System.out.println("Media real " + Mar);
                if (Mar > 7){
                    System.out.println("Aluno " + nome + " Aprovado.Parabéns!");
                }
                else if( Mat > 4 && Mat < 6){
                    System.out.println("Aluno" + nome + " está na final!!");
                }else{
                    System.out.println("Aluno" + nome + " Reprovado!");
                }
            con ++;
            break;
            }
              
        }
          
    }
    
}