package escolaInfantil;

import java.util.ArrayList;

public class Turma { 
	
	private int matriculados;
	private Alunos[] Alunos = new Alunos[20];
	
//---------------------------------------------------------------------------------------------------------------------------	
	public boolean setAluno (Alunos aluno) { 
		
		if ( matriculados < 20 ) { 
			
			this.Alunos[matriculados] = ( aluno );
			matriculados += 1;
			return true;
		}else{
			
			System.out.println("Turma lotada");
			return false;
		}
		
	}
//----------------------------------------------------------------------------------------------------------------------------	
	public void getLista() { 
		
		for ( int i = 0; i < matriculados; i++ ){
			
			System.out.println(( i + 1) + " - " + this.Alunos[i].getNome());
		}
	
	}

//---------------------------------------------------------------------------------------------------------------------------		
	public int matriculados()  { return (this.matriculados); }

}