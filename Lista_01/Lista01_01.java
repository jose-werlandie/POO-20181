import java.util.Scanner;

public class  Lista01_01{
	public static void main(String[] args){
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println( "Informe uma velocidade em m/s" );
	float VelocidadeMs = scan.nextFloat();

	double VelocidadeKmh = ( VelocidadeMs * 3.6 );
	
	System.out.print("Sua velocidade é  " + VelocidadeKmh + " Km/s");
	}
}