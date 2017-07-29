import java.util.*;
public class TestArrayTri {

	public static void main(String[] args) {
		 int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		 
		 //////////////////////////////////////////////////////////////////////////////	
		 //////////////////////////////////////////////////////////////////////////////
		 //Faire un algorithme qui trie le tableau dans l’ordre ascendant
		 System.out.println("Faire un algorithme qui trie le tableau dans l’ordre ascendant");
		 
		 for( int i = 0 ; i <= array.length-1 ; i++){
			 for (int j = i + 1 ; j <= array.length-1 ; j ++){
				 if(array[j] < array[i]){
					 int temp = array[i];
					 array[i] = array[j];
					 array[j] = temp;
				 }
			 }
			 System.out.print(array[i]+" ");
		 }
		 
		 //////////////////////////////////////////////////////////////////////////////	
		 //////////////////////////////////////////////////////////////////////////////
		 //Utiliser la classe Arrays pour trier le tableau
		 System.out.println();
		 System.out.println();
		 System.out.println("Utiliser la classe Arrays pour trier le tableaut");
	 
		 array = new int[]{1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		 
		 Arrays.sort(array);
		 for(int i = 0; i <= array.length-1 ; i++){
             System.out.print(array[i]+ " ");
		 }	

	}

}
