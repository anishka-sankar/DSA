package Problems;

public class InfiniteArraySize {

	public static void main(String[] args) {
		int result=ans(new int[] {4,7,9,13,18,30,60}, 30);
		System.out.println(result);

	}
	
	public static int ans(int[] arr, int target) {
		//find the range 
		
		//start with box of size 2
		int start=0;
		int end=1;
		//condition for the target to lie in the range
		while( target > arr[end]) {
			int temp=end+1;
			//prevoius end + size of box*2
			end=end+(end-start+1)*2;
			start=temp;
		}
		return search(arr, target, start, end );
		
	}

	private static int search(int[] arr, int target, int start, int end) {
		int mid=0;
		while(start <= end) {
			mid=start+((end-start)/2);
			if( arr[mid]==target) {
				return mid;
			}
			else if( arr[mid]>target) {
				end=mid-1;
			}
			else {
				start=mid+1;
			}
		}
		
		return -1;
	}

}
