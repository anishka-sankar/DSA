package Problems;

public class FindMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(linearSearch(new int []{5,30,45,10,3,38,29}));
	}
	
	
	public static int linearSearch(int a[]) {
		if(a.length==0) {
			return -1;
		}
		    int min=a[0];
			for(int i=1;i<a.length;i++) {
				if(min>a[i]) {
					min=a[i];
				}
			}
		
		return min;
	}

}
