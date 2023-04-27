
public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result=search(new int[] {4,7,9,13,18,30,60}, 60);
		System.out.println(result);
	}
	
	static int search(int[] value, int target) {
		int start=0;
		int end=value.length-1;
		int mid=0;
		while(start <= end) {
			//mid=(start+end)/2; // this may exceed the range of integers
			mid=start+((end-start)/2);
			if(value[mid]==target) {
				return mid;
			}
			else if(value[mid]>target) {
				end=mid-1;
			}
			else {
				start=mid+1;
			}
		}
		
		return -1;
		
	}

}
