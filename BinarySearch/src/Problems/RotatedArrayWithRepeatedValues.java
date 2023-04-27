package Problems;

class RotatedArrayWithRepeatedValues {
	
	public static void main(String[] args) {
		int result=search(new int[] {3,3,5,5,1}, 3);
		System.out.println(result);

	}
    public static int search(int[] nums, int target) {
        int max=findPivot(nums);
       System.out.println(max);
        int ans=0;
        int start=0;
        int end=nums.length-1;
        if(max != -1 && target==nums[max]) {
        	ans=max;
        }
        else if(max==-1) {
        	 ans=BS(nums,target,start,end);
        }
        else if(target>=nums[0]){
        	end=max;
        	ans=BS(nums,target,start,end);
        }
        else {
        	 start=max+1;
             ans=BS(nums,target,start,end);
        }
        
        return ans;
            
        }
    
    
    public static int findPivot(int[] nums){
        int start=0;
        int end=nums.length-1;
        int mid=0;
    
        while(start<=end){       	
            mid=start+((end-start)/2);
            if(end>mid && nums[mid]>nums[mid+1]) {
            	return mid;
            }
            if(start<mid && nums[mid]<nums[mid-1]) {
            	return mid-1;
            }
            if(nums[mid]==nums[start] && nums[mid]==nums[end]){
                if(nums[start]<nums[start+1]) {
                	return start;
                }
                else if(nums[end]<nums[end-1]) {
                	return end-1;
                }
                else {
                	start++;
                	end--;
                }
            }
            else if(nums[mid]>nums[start] || (nums[start] == nums[mid] && nums[mid]>nums[end])) {
            	start=mid+1;
            }
            else{
                end=mid-1;
            }
            
        }
        
        return -1;
    }

   public static int BS(int[] nums, int target, int start, int end){
       int mid=0;
       while(start<=end){
           
           mid=start+((end-start)/2);
           if(nums[mid]==target){
               return mid;
           }
           else if(nums[mid]>target){
               end=mid-1;
           }
           else{
               start=mid+1;
           }
       }
       
       return -1;
   }
}
