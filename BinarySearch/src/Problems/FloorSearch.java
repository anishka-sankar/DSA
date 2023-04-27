package Problems;

//biggest element in an array which is <= target element
public class FloorSearch {

	public static void main(String[] args) {
		int result=search(new int[] {4,7,9,13,18,30,60}, 11);
		System.out.println(result);

	}

	private static int search(int[] arr, int target) {
		
		if(target < arr[0]) {
			return -1;
		}
		int start=0;
		int end =arr.length-1;
		int mid=0;
		while(start<=end) {
			mid=start+((end-start)/2);
			if(arr[mid]==target) {
				return mid;
			}
			else if(arr[mid]<target) {
				start=mid+1;
			}
			else {
				end=mid-1;
			}
		}
		return end;
	}

}
