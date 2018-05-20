package escolaInfantil;

class Alunos{
	
	private String nome;
	private String nomeMae;
	private String Turma;
	private String Data;
	
//-----------------------------------------------------------------------------	
	public void setNome(String n)        { nome = n; }
	
	public void setNomeMae(String nm)    { nomeMae = nm; }
	
	public void setTurma(String T)       { Turma = T; }
	
	public void setData(String d )       { Data = d; }
	
//-----------------------------------------------------------------------------	
	public String getNome()          { return nome; }
	
	public String getNomeMae()       { return nomeMae; }
	
	public String getTurma()         { return Turma; }
	
	public String getData()          { return Data; }
	
//---------------------------------------------------------------------------------------------------------------------------

public void imprimeDados() { 
		
		System.out.println("nome: " + this.nome);
		System.out.println("Data de nascimento: " + this.Data);
		System.out.println("Nome da mae: " + this.nomeMae);
		System.out.println("Turma: " + this.Turma);
	}
}