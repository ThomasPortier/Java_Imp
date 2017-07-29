import java.util.Scanner;

public class TestFibonacci {

	public static void main(String[] args) {
		
		System.out.println("Entrer le numéro du rang de la suite de Fibonacci que vous voulez afficher \n");
		Scanner questionUser = new Scanner(System.in);
		
		int rang = questionUser.nextInt();
		int [] fibonacci= new int [rang];
		fibonacci[0]=0;
		fibonacci[1]=1;
		for (int i = 0 ; i <= rang-3 ; i++){
			fibonacci[i+2]=fibonacci[i]+fibonacci[i+1];
		}
		System.out.println(fibonacci[rang-1]);
		
		for (int i  =0 ; i<= rang-1 ; i++){
			System.out.print(fibonacci[i]+ " ");
		}
	}

}
