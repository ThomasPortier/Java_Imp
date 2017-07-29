
public class TestArray1 {

	public static void main(String[] args) {
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		//////////////////////////////////////////////////////////////////////////////	
		//////////////////////////////////////////////////////////////////////////////	
		
		//Afficher l�ensemble des �l�ments du tableau gr�ce � une boucle
		System.out.println("Afficher l�ensemble des �l�ments du tableau gr�ce � une boucle");
		for (int i = 0 ; i <= array.length-1 ; i++){
			System.out.print(array[i]+ ", ");
		}
		//////////////////////////////////////////////////////////////////////////////	
		//////////////////////////////////////////////////////////////////////////////	
		
		System.out.println("\n");
		//Afficher l�ensemble des �l�ments dans l�ordre inverse du tableau
		System.out.println("Afficher l�ensemble des �l�ments dans l�ordre inverse du tableau");
		
		for (int i = array.length-1 ; i >= 0 ; i--){
			System.out.print(array[i]+ ", ");
		}
		//////////////////////////////////////////////////////////////////////////////		
		//////////////////////////////////////////////////////////////////////////////	
		
		System.out.println("\n");
		//Faire une boucle et un test de mani�re � n�afficher que les entiers sup�rieurs � 3
		System.out.println("Faire une boucle et un test de mani�re � n�afficher que les entiers sup�rieurs � 3");
		
		for (int i = 0 ; i <= array.length-1 ; i++){
			if (array[i] > 3){
			System.out.print(array[i]+ ", ");
			}
		}
		//////////////////////////////////////////////////////////////////////////////	
		//////////////////////////////////////////////////////////////////////////////	
		
		System.out.println("\n");
		//Faire une boucle qui affiche uniquement les entiers pairs
		System.out.println("Faire une boucle qui affiche uniquement les entiers pairs");
		
		for (int i = 0 ; i <= array.length-1 ; i++){
			if (array[i]%2 == 0){
			System.out.print(array[i]+ ", ");
			}
		}
		//////////////////////////////////////////////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////////	
		
		System.out.println("\n");
		//Afficher le plus grand �l�ment du tableau
		System.out.println("Afficher le plus grand �l�ment du tableau");
		
		int max = 0;
		for (int i = 0 ; i <= array.length-1 ; i++){
			if (array[i] > max){
				 max = array[i];
			}
		}
		System.out.print(max);
		////////////////////////////////////////////////////////////////////////////////
		//////////////////////////////////////////////////////////////////////////////	
		
		System.out.println("\n");
		//Afficher le plus petit �l�ment du tableau
		System.out.println("Afficher le plus petit �l�ment du tableau");
		
		int min = 0;
		for (int i = 0 ; i <= array.length-1 ; i++){
			if (array[i] < min){
				 min = array[i];
			}
		}
		System.out.print(min);	
	}
}
