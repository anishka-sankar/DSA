
public class LinearSearch {

	public static void main(String[] args) {
		
		System.out.println(linearSearch(new int []{3,5,30,45,10,38,29}, 10));
	}
	
	public static int linearSearch(int a[], int key) {
		if(a.length==0) {
			return -1;
		}
			for(int i=0;i<a.length;i++) {
				if(key==a[i]) {
					return i;
				}
			}
		
		
		return -1;
	}

}
