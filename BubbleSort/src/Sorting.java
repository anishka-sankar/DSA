//Bubble sort - Compare with adjacent element and swap. The array will be sorted from last.
//best time complexity - O(N)
//worst time complexity - O(N2)
//Space complexity - O(1) constant

public class Sorting {

	public static void main(String[] args) {
		int[] arr=new int [] {5,-3,9,7,1};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		for(int a:arr) {
			System.out.println(a);
		}
	}

}
