import java.util.*;
//finding leaders in array(numbers such that all the later occuring numbers re smaller)
class Prac1{

	public static void main(String args[]){
		int array[] = {16, 19, 4, 3, 8, 3};
		Leader l = new Leader();
		l.find_leader(array);
	}
}

class Leader{

	public void find_leader(int[] array){
			int max=0;
			int i,j;
			for(i=0;i<array.length;i++){
				for (j=i+1;j<array.length;j++ ) {
					if (array[i] <= array[j]){
						break;
					}	
					
				}
			if (j == array.length){
				System.out.println(array[i]);
			}
			}
		}
}
