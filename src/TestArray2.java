
public class TestArray2 {

	public static void main(String[] args) {
		 int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		 
		//////////////////////////////////////////////////////////////////////////////	
		//////////////////////////////////////////////////////////////////////////////	

		//Quelle est la moyenne des éléments du tableau ?
		 
		System.out.println("Quelle est la moyenne des éléments du tableau ?");
		
		int somme = 0;	
		for (int i = 0 ; i <= array.length-1; i++){	
			somme = somme + array[i];				
		}
		double moyenne = ((double)somme / (double)(array.length));
		System.out.println(moyenne);
		
		//////////////////////////////////////////////////////////////////////////////	
		//////////////////////////////////////////////////////////////////////////////	
		
		// Quel est l’index dans le tableau de l’entier 15 ?
		
		System.out.println();
		System.out.println("Quel est l’index dans le tableau de l’entier 15 ?");
		for (int i = 0 ; i <= array.length-1 ; i++){
			if (array[i] == 15){
				System.out.println(i);
			}
		}
		
		//////////////////////////////////////////////////////////////////////////////	
		//////////////////////////////////////////////////////////////////////////////			
		
		//Ecrire un algorithme pour trouver le nombre d’entiers en doublon dans le tableau
		System.out.println();
		System.out.println("Ecrire un algorithme pour trouver le nombre d’entiers en doublon dans le tableau");
		
		int doublon = 0;
		for (int i = 0 ; i <= array.length-1 ; i++){
			for (int j = 0 ; j <= array.length-1 ; j++){
				if(array[i] == array[j]){
					doublon = doublon+1;
				}
			}
		}
		System.out.println((doublon-array.length)/2);			
	}

}

