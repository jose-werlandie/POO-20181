import java.util.Scanner;

public class Lista01_07{
	public static void main(String[] args){
		Scanner inpt = new Scanner(System.in);
		
		System.out.println("Digite sua nota");
		int nota = inpt.nextInt();
		
		if (nota >= 0 && nota < 50){
			System.out.println("Insuficiente") ;
		
		} else if (nota >= 50 && nota <= 64){
			System.out.println("Regular");
		
		} else if (nota >= 65 && nota <= 84){
			System.out.println("Bom");
		
		} else if (nota >= 85 && nota <= 100 ){
			System.out.println("Otimo");
		
		} else {
			System.out.println("Nota invalida");
		}
	}
}