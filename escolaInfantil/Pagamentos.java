package escolaInfantil;

public class Pagamentos {
	
	private double Valor;
	private String Pagamento;
	private String Vencimento;
	private String Referente;
	
//------------------------------------------------------------------------------	

	public void setValor (double v)                    { Valor = v; }
	
	public void setPagamento (String p)                { Pagamento = p; }
	
	public void setVencimento(String v)                { Vencimento = v; }
	
	public void setReferente(String r)                 { Referente = r; }
	
//------------------------------------------------------------------------------

	public void imprimeBoleto() {
		
		System.out.println("Pagamento :");
		System.out.println("referente a " + Referente);
		System.out.println("valor: " + Valor);
		System.out.println("metodo de pagamento: " + Pagamento);
		System.out.println("data de vencimento: " + Vencimento);
	}	
	
}