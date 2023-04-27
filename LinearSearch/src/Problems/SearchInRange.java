package Problems;

public class SearchInRange {

	public static void main(String[] args) {
		
		System.out.println(linearSearch(2,5,new int []{3,5,30,45,10,38,29}, 29));
	}
	
	public static int linearSearch(int start, int end, int a[], int key) {
		if(a.length==0) {
			return -1;
		}
		else {
			for(int i=start;i<=end;i++) {
				if(key==a[i]) {
					return i;
				}
			}
		}
		
		return -1;
	}

}
