
public class ArrayTest {

	public static void main(String[] args) {
		
                int[] [] numbers = new int [4] [4];
				
				for (int i = 0; i < numbers.length; i++) {
					for (int j = 0; j < numbers[0].length; j++) {
						numbers [i] [j]= (int) (Math.random() * 100);
					}
					
				}
				
				int[] [] mirror = new int[4] [4];
				
				for(int i = 0; i < mirror.length;  i++) {
					for (int j = 0; j < mirror[0].length;  j++) {
						mirror[i] [j] = numbers[i] [numbers[0].length-1-j] ;
					}
				}
			//print	
				for (int i = 0;  i < numbers.length;  i++) {
					for(int  j =0; j < numbers[0].length; j++) {
						System.out.println(numbers[i] [j] ++ ) ;
					}
				         System.out.println();
						}
					    System.out.println();
			
	}	
	
}



	


