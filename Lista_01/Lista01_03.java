import java.util.Scanner;

public class Lista01_03{
	public static void main(String[] args){
	
	Scanner scan = new Scanner( System.in );
	
	System.out.println ( "Informe as 3 notas" );
	
	float nota1 = scan.nextFloat();
	float nota2 = scan.nextFloat();
	float nota3 = scan.nextFloat();

	float media = (( nota1 * 2 ) + ( nota2 * 3 ) + ( nota3 * 5 ))/(2+3+5);

	System.out.print( "Sua media é " + media );
	}
}