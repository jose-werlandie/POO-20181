package escolaInfantil;

class Professores {
	
	private String grau;
	private String nome;
	private double salario;

//-----------------------------------------------------------------------------		
	public void setNome(String n)    { nome = n; }
	
	public void setSalario(double v) { salario = v; }
	
	public void setGrau(String i)    { grau = i; }
	
//-----------------------------------------------------------------------------		
	public String getNome()            { return nome; }
	
	public String getGrau()            { return grau; }
	
	public double getSalario()         { return salario; }

//---------------------------------------------------------------------------------------------------------------------------
	
	public void imprimeDados () {
		System.out.println("Nome: " + this.nome);
		System.out.println("Grau de instrução: " + this.grau);
		System.out.println("Salario" + this.salario);
	
	}

}