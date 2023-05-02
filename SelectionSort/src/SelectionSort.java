//It identifies the max/min element and place it in the order(swaps it). Worst & Best time complexity are same O(N2). 
public class SelectionSort {

	public static void main(String[] args) {
		int[] arr=new int [] {5,-3,9,7,1};
		
		for(int i=0;i<arr.length;i++) {
			int end=arr.length-1-i;
			int maxInd=findMax(arr,0,end);
			swap(arr,maxInd,end);
		}
		
		for(int n:arr) {
			System.out.println(n);
		}
	}

	private static void swap(int[] arr, int maxInd, int end) {
		int temp=arr[maxInd];
		arr[maxInd]=arr[end];
		arr[end]=temp;
		
	}

	private static int findMax(int[] arr, int start, int end) {
		int max=0;
		for(int i=start;i<=end;i++) {
			if(arr[i]>arr[max]) {
				max=i;
			}
		}
		
		return max;
	}

}
