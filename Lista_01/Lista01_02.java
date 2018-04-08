import java.util.Scanner;

public class Lista01_02{
	public static void main(String[] args){
	
	Scanner scan = new Scanner( System.in );

	System.out.println( "Informe o ano de seu nascimento so seguinte formato: 2018");
	int Ano = scan.nextInt();

	int Idade = 2018 - Ano;

	System.out.print( "Sua idade é " + Idade );
	}
}