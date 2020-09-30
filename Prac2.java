//max difference where greater number comes after smaller in array
class Prac2{
	public static void main(String args[]){
		int a[] = {2, 3, 10, 6, 4, 8, 1};
		int b[] = {7, 9, 5, 6, 3, 2};

		difference d = new difference();
		d.get_difference(a);
		d.get_difference(b);
	}
}

class difference{

	public void get_difference(int[] a){
		int i,j;
		int max_diff = a[1]-a[0];
		for(i=0;i<a.length;i++){
			for(j=i;j<a.length;j++){
				if(max_diff < (a[j]-a[i])){
					max_diff = a[j] - a[i];
				}
			}
		}
		System.out.println(max_diff);
	}
}
