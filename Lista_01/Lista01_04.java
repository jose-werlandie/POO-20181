import java.util.Scanner;

public class Lista01_04{
	public static void main(String[] args){
	
		Scanner scan = new Scanner( System.in );

		System.out.println( "Informe suas 4 notas " );
									
		float nota1 = scan.nextFloat();
		float nota2 = scan.nextFloat();
		float nota3 = scan.nextFloat();
		float nota4 = scan.nextFloat();
				
		float media =(nota1 + nota2 + nota3 + nota4)/4;

		if ( media >= 7 ){
			System.out.print( "Aprovado" );  
		}
		
		else if ( media >=5  && media < 7 ){
			System.out.print( "Final" );	 
		
		}
		else{
			System.out.print( "Reprovado" );
		}
	}
}