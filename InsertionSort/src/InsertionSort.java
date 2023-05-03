//It will sort the left most array index. In first iteration till index 1 it will get sorted, In second iteration till index 2 it will get sorted and goes on...
// Worst case - O(n2), Best case - O(n)
public class InsertionSort {
	public static void main(String[] args) {
		int[] arr=new int[] {5,-3,9,7,1};
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j>0;j--) {
				if(arr[j]<arr[j-1]) {
					swap(arr,j,j-1);
				}
				else {
					break;
				}
			}
		}
		
		for(int n:arr) {
			System.out.println(n);
		}
	}

	private static void swap(int[] arr, int j, int i) {
		int temp;
		temp=arr[j];
		arr[j]=arr[i];
		arr[i]=temp;
		
	}
}
