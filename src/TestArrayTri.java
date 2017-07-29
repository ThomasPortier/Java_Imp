
public class TestArrayTri {

	public static void main(String[] args) {
		 int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		 
		//////////////////////////////////////////////////////////////////////////////	
		//////////////////////////////////////////////////////////////////////////////
		//Faire un algorithme qui trie le tableau dans l’ordre ascendant
		 
		 for( int i = 0; i <= array.length-2 ; i++){
			 if(array[i] > array[i+1]){
				 int temp = 0;
				 array[i] = array[i+1];
				 array[i+1] = temp;
			 }
		 }
			
		 System.out.print(array);
		 

		

	}

}
