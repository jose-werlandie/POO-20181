package escolaInfantil;

import java.util.ArrayList;

public class Busca {
	
	private final ArrayList<Alunos> AlunosMatriculados = new ArrayList<>();
	private int TotalAlunos;
	
	private final ArrayList<Professores> ProfessoresContratados = new ArrayList<>();
	private int TotalProfessores;
	
	private final ArrayList<Pagamentos> Pagamentos = new ArrayList<>();
	private int NumeroDoBoleto;
	
//-------------------------------------------------------------------------------------------------------------------------------

	public void setAlunosMatriculados(Alunos aluno) {
		
		this.AlunosMatriculados.add(aluno);
		System.out.println("Numero de matricula: "+ this.TotalAlunos);
		this.TotalAlunos +=1;
	}

//-------------------------------------------------------------------------------------------------------------------------------

	public void setProfessoresContratados(Professores professor){
		
		this.ProfessoresContratados.add(professor);
		System.out.println("Numero de matricula: " + this.TotalProfessores);
		this.TotalProfessores +=1;
	}

//-------------------------------------------------------------------------------------------------------------------------------
	public void setBoleto ( Pagamentos pagamento){
		
		this.Pagamentos.add(pagamento);
		System.out.println("Numero do boleto: " + this.NumeroDoBoleto);
		this.NumeroDoBoleto +=1;
	}

//-------------------------------------------------------------------------------------------------------------------------------

	public void getDadosAluno ( int TotalAlunos) {
		
		if (TotalAlunos + 1 > TotalAlunos) {
			System.out.println("Aluno não indentificado");
		}else{
			this.AlunosMatriculados.get(TotalAlunos).imprimeDados();
		}
	}
//-------------------------------------------------------------------------------------------------------------------------------

	public void getDadosProfessor( int TotalProfessores ) {
		
		if (TotalProfessores +1 > TotalProfessores) {
			System.out.println("Professor não identificado");
		}else{
			this.ProfessoresContratados.get(TotalProfessores).imprimeDados();
		}
	}

//-------------------------------------------------------------------------------------------------------------------------------

	public void getPagamento( int NumeroDoBoleto) {
		
		if ( NumeroDoBoleto + 1 > NumeroDoBoleto ) {
			System.out.println("Boleto nao identificado");
		}else{
                        this.Pagamentos.get(NumeroDoBoleto).imprimeBoleto();
                }
	}
}