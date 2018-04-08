import java.util.Scanner;
public class Lista01_11{
	public static void main(String[] args){
		float total = (float)0.0;
		Scanner inpt = new Scanner(System.in);
		System.out.println("Por favor, digite o codigo o produto desejado, ao termino digitar 999.");
		while(true){
			int codigo = inpt.nextInt();
			if (codigo == 10){
				System.out.println("Pastel de carne, R$ 1,50. Quantos deseja?");
				int qtd = inpt.nextInt();
				total += qtd * (float)1.5;
			} else if (codigo == 11){
				System.out.println("Coxinha de frango, R$ 1,80. Quantas deseja?");
				int qtd = inpt.nextInt();
				total += qtd * (float)1.8;
			} else if (codigo == 12){
				System.out.println("Empada de frango, R$ 1,90. Quantas deseja?");
				int qtd = inpt.nextInt();
				total += qtd * (float)1.9;
			} else if (codigo == 20){
				System.out.println("Hamburguer, R$ 10,00. Quantos deseja?");
				int qtd = inpt.nextInt();
				total += qtd * (int)10;
			} else if (codigo == 30){
				System.out.println("Pizza, R$ 8,00. Quantas deseja?");
				int qtd = inpt.nextInt();
				total += qtd * 8;
			} else if (codigo == 50){
				System.out.println("Sucoo, R$ 2,50. Quantos deseja?");
				int qtd = inpt.nextInt();
				total += qtd * (float)2.5;
			} else if(codigo == 999){
				break;
			} else {
				System.out.println("Codigo de produto invalido");
			}
			System.out.println("Total atual da conta: R$" + total);
		}  // Fim do while
		if (total > 50){
			total = total * (float)0.95;
			System.out.println("Com desconto de 5%...");
		}
		System.out.println("O total eh R$" + total);
	}
}