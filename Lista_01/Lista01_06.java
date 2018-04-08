import java.util.Scanner;

public class Lista01_06{
	public static void main(String[] args){
		Scanner inpt = new Scanner(System.in);
		
		System.out.println("Digite seu nome ");
		String Nome = inpt.nextLine();
		
		System.out.println("Digite a quantidade de dias de sua estadia");
		int diaria = inpt.nextInt();
		if (diaria < 15){
			int total = 68 * diaria;
			System.out.println(Nome + ", o custo de sua estadia sera de: R$" + total) ;
		
		} else if (diaria == 15){
			int total = 66 * diaria;
			System.out.println(Nome + ", o custo de sua estadia sera de: R$" + total);
		
		} else if (diaria > 15){
			Float total = (float)65.5 * diaria;
			System.out.println(Nome + ", o custo de sua estadia sera de: R$" + total);
		}
	}
}