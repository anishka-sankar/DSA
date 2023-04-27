package Problems;

public class RotatedTimes {

	public static void main(String[] args) {
		int result=search(new int[] {4,1,2,3});
		System.out.println(result);

	}
	
	 public static int search(int[] nums) {
	        int max=findPivot(nums);
	       System.out.println(max);
	        if(max==-1) {
	        	return 0;
	        }
	        else {
	        	return max+1;
	        }
	        
	 }

	private static int findPivot(int[] nums) {
		int start=0;
		int end=nums.length-1;
		int mid=0;
		while(start<=end) {
			mid=start+((end-start)/2);
			if(end > mid && (nums[mid]>nums[mid+1])) {
				return mid;
			}
			if(start < mid && (nums[mid]<nums[mid-1])) {
				return mid-1;
			}
			if(nums[start]==nums[mid] && nums[end]==nums[mid]) {
				if(start < mid && nums[start]<nums[start+1]) {
					return start;
				}
				if(end > mid && nums[end]<nums[end-1]) {
					return end-1;
				}
				
				start++;
				end--;
			}
			
			else if(nums[mid]>=nums[start] || (nums[mid]==nums[start] && nums[mid]>nums[end])) {
				start=mid+1;
			}
			else {
				end=mid-1;
			}			
		}
		return -1;
	}

}
