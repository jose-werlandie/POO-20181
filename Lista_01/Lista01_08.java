import java.util.Scanner;

public class Lista01_08{
	public static void main(String[] args){
		Scanner inpt = new Scanner(System.in);
		
		System.out.println("Digite 10 numeros");
		
		int n1 = inpt.nextInt(), n2 = inpt.nextInt(), n3 = inpt.nextInt(), n4 = inpt.nextInt(), n5 = inpt.nextInt(), maior;
		int n6 = inpt.nextInt(), n7 = inpt.nextInt(), n8 = inpt.nextInt(), n9 = inpt.nextInt(), n10 = inpt.nextInt(), menor;
		
		menor = n1;
		maior = n1;
		
		if(n2 < menor){
			menor = n2;
		}
		if(n3 < menor){
			menor = n3;
		}
		if(n4 < menor){
			menor = n4;
		}
		if(n5 < menor){
			menor = n5;
		}
		if(n6 < menor){
			menor = n6;
		}
		if(n7 < menor){
			menor = n7;
		}
		if(n8 < menor){
			menor = n8;
		}
		if(n9 < menor){
			menor = n9;
		}
		if(n10 < menor){
			menor = n10;
		}
		if(n2 > maior){
			maior = n2;
		}
		if(n3 > maior){
			maior = n3;
		}
		if(n4 > maior){
			maior = n4;
		}
		if(n5 > maior){
			maior = n5;
		}
		if(n6 > maior){
			maior = n6;
		}
		if(n7 > maior){
			maior = n7;
		}
		if(n8 > maior){
			maior = n8;
		}
		if(n9 > maior){
			maior = n9;
		}
		if(n10 > maior){
			maior = n10;
		}
		
		float media = (int)(n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9 + n10)/ (float)10.0;
		System.out.println("O menor numero eh: "+menor+ ". O maior eh: "+maior+" E a media eh: "+media);
	}
}
