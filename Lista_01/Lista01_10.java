import java.util.Scanner;
public class Lista01_10{
	public static void main(String[] args){
		Scanner inpt = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		
		Float x = inpt.nextFloat();
		int total = 0;
		
		while (x >= 1){
			x = x/2;
			total += 1;
		}
		System.out.println("o resultado de "+total+" divisoes por 2 é "+x);
	}
}