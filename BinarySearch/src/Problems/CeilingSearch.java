package Problems;

//smallest element in an array which is >= target element
public class CeilingSearch {

	public static void main(String[] args) {
		int result=search(new int[] {4,7,9,13,18,30,60}, 22);
		System.out.println(result);
		
		int result1=search1(new int[] {4,7,9,13,18,30,60}, 11);
		System.out.println(result1);
	}

   
	
	//sol 1
	private static int search(int[] arr, int target) {
		
		if(target > arr[arr.length-1]) {
			return -1;
		}
		int start=0;
		int end=arr.length-1;
		int mid=0;
		while(start<=end) {
			mid=start+((end-start)/2);
			if(target==arr[mid]) {
				return mid;
			}
			else if(arr[mid]<target) {
				start=mid+1;
			}
			else {
				end=mid-1;
			}
		}
		return start;
	}




	//sol2
	private static int search1(int[] arr, int target) {
		if(target > arr[arr.length-1]) {
			return -1;
		}
		int start=0;
		int end=arr.length-1;
		int mid=0;
		while(start<=end) {
			mid=start+((end-start)/2);
			if(arr[mid]==target) {
				return mid;
			}
			else if(arr[mid]>target) {
				end=mid;
			}
			else {
				start=mid;
			}
			
			if(start==(end-1)) {
				int index=target<arr[start] ? start : end ;
				return index;
			}
		}
		return -1;
	}

}
