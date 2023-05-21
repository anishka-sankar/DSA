
public class BinarySearchUsingRecurssion {

	public static void main(String[] args) {
		int arr[] = new int [] {6,8,10,27,39};
		int target=39;
		System.out.println(binarySearch(arr,target, 0,arr.length-1));

	}

	private static int binarySearch(int[] arr, int target, int s, int e) {
		int mid=0;
		if(s>e) {
			return -1;
		}
		mid=s+(e-s)/2;
		if(target==arr[mid]) {
			return mid;
		}
		else if(target>arr[mid]){
			return binarySearch(arr,target, mid+1,e);
		}
		else {
			return binarySearch(arr,target, s,mid-1);
		}
	
		
	}

}
