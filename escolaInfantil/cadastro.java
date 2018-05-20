package escolaInfantil;

import java.util.Scanner;
import java.util.ArrayList;

public class cadastro {
	
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );

        int matriculados = 0;

        Busca Buscar = new Busca();

        Turma TurmaA = new Turma();
        Turma TurmaB = new Turma();
        Turma TurmaC = new Turma();

        Alunos[] Alunos = new Alunos[20];
//---------------------------------------------------------------------------------------------------------------------------	
        while ( true ) {
            System.out.println ("Alunos (1) Professores(2) Turma(3) pagamentos(4) Finalizar (0)");

            String opção = scan.nextLine();

//---------------------------------------------------------------------------------------------------------------------------			
            if ( opção.equals("0"))             { break; }

            else if (opção.equals("1")){

                while ( true ) {
                        Alunos pessoa = new Alunos();
                        System.out.println("Digite o nome do aluno");
                        String nome = scan.nextLine();
                        pessoa.setNome( nome );

                        System.out.println("Digite a data de nascimento seguindo o formato 00/00/0000");
                        String Data = scan.nextLine();
                        pessoa.setData( Data );

                        System.out.println("Digite o nome da sua mãe");
                        String nomeMae = scan.nextLine();
                        pessoa.setNomeMae( nomeMae );

                        System.out.println("Escolha sua turma:");
//---------------------------------------------------------------------------------------------------------------------------					
                        while ( true ){

                            if (TurmaA.matriculados() < 20) {
                                System.out.println("Turma A: " + (20 - TurmaA.matriculados()) + " vagas disponiveis.");
                                System.out.println("Aderir a turma ? sim(1)   nao(2)");

                                int op = scan.nextInt();

                                if ( op == 1 ){

                                    pessoa.setTurma("A");
                                    TurmaA.setAluno(pessoa);
                                    break;
                                }
                            }
                            //----------------------------------------------------------------------------------------------------
                            if ( TurmaB.matriculados() < 20) {

                                System.out.println("Turma B: " + ( 20 - TurmaB.matriculados()) + "vagas disponiveis.");
                                System.out.println("Aderir a turma ? sim (1)  não (2)");

                                int op = scan.nextInt();

                                if ( op == 1 ) {

                                    pessoa.setTurma("B");
                                    TurmaB.setAluno(pessoa);
                                    break;
                                }
                            }
                            //----------------------------------------------------------------------------------------------------
                            if ( TurmaC.matriculados() < 20 ) {

                                System.out.println("Turma C: " + ( 20 - TurmaC.matriculados()) + "vagas disponiveis.");
                                System.out.println("Aderir a turma ? sim (1)  não (2)");

                                int op = scan.nextInt();

                                if ( op == 1 ) {

                                        pessoa.setTurma("C");
                                        TurmaC.setAluno(pessoa);
                                        break;
                                }
                            }
                            //----------------------------------------------------------------------------------------------------
                    }
                    Buscar.setAlunosMatriculados(pessoa);
                    System.out.println("Seja bem vindo " + pessoa.getNome());
                    String Buffer = scan.nextLine();
                    break;
                    
                }
            }
            //---------------------------------------------------------------------------------------------------------------------
            else if (opção.equals("2")){ 
                while (true){
                   System.out.println("Cadastrar professor(1)     Verificar dados de um professor(2)     voltar(0)");
                   String op = scan.nextLine();
                   
                   if ( opção.equals("0"))             { break; }
                   
                   else if(opção.equals("1") ){
                       Professores professor = new Professores();
                       
                       System.out.println("Nome :");
                       String nome = scan.nextLine();
                       professor.setNome(nome);
                       
                       System.out.println("Grau :");
                       String Grau = scan.next();
                       professor.setGrau(Grau);
                       
                       System.out.println("Salario");
                       double salario = scan.nextDouble();
                       professor.setSalario(salario);
                       
                       Buscar.setProfessoresContratados(professor);   
                   }
                    else if(opção.equals("2") ){
                        System.out.println("Numero da matricula :");
                        int n = scan.nextInt();
                        Buscar.getDadosProfessor(n);
                   }
                }
            }
            //------------------------------------------------------------------------------------------------------------------------------------------
            else if (opção.equals("3")){
                System.out.println("Verificar alunos na turma A(1)     Verificar alunos na turma B(2)     Verificar alunos na turma C(3)   Voltar(0)" );
                
                String op = scan.next();
                if ( opção.equals("0"))             { break; }
                
                else if (opção.equals("1")){
                    System.out.println("Aluno matriculados turma A:");
                    TurmaA.getLista();
                }
                else if (opção.equals("2")){
                    System.out.println("Aluno matriculados turma B:");
                    TurmaB.getLista();
                }
                else if (opção.equals("3")){
                    System.out.println("Aluno matriculados turma :");
                    TurmaC.getLista();
                }else{
                    System.out.println("C é burro cara, Ta errado!");
                }
            }
            //------------------------------------------------------------------
            else if (opção.equals("4")){
                while(true){
                  System.out.println("Novo pagamento(1)     Verificar pagamentos(2)     Voltar(0)");  
                  String op = scan.next();
                  if ( opção.equals("0"))             { break; }
                  
                  else if (opção.equals("1")){
                    Pagamentos boleto = new Pagamentos();
                    System.out.println("Referencia do pagamento");
                    String referencia = scan.next();
                    boleto.setReferente(referencia);
                    
                    System.out.println("Valor :");
                    double valor = scan.nextDouble();
                    boleto.setValor(valor);
                    
                    System.out.println("Forma de pagamento");
                    String forma = scan.next();
                    boleto.setPagamento(forma);
                    
                    System.out.println("vencimento");
                    String vencimento = scan.next();
                    boleto.setVencimento(vencimento);
                    
                    Buscar.setBoleto(boleto);
                    }
                  else if (opção.equals("2")){
                    System.out.println("Numero do boleto");
                    int n = scan.nextInt();
                    Buscar.getPagamento(n);
                    String Buffer = scan.nextLine();
                  }
                }
            }
        }
    }
}