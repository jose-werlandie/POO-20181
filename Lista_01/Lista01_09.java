import java.util.Scanner;

public class Lista01_09{
	public static void main(String[] args){
	
		Scanner scan = new Scanner( System.in );

		System.out.print("Informe 2 numeros");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		
		int pares = 0;
		int impar = 0;
		int soma  = n1 + n2;			

		if ( n1 % 2 == 0 ){
			pares +=1;
		}else{
			impar +=1;
		}

		if ( n2 % 2 == 0 ){
			pares +=1;
		}else{
			impar +=1;
		}

		System.out.println("quantidade de pares " + pares);
		System.out.println("quantidade de impares " + impar);
		System.out.println("a soma dos dois é " + soma);

	}
}