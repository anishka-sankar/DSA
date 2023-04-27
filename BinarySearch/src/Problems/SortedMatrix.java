package Problems;

import java.util.Arrays;

public class SortedMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] result=search(new int[][] {{10,16,23},{38,45,56},{68,79,86}}, 79 );
		System.out.println(Arrays.toString(result));
	}
	
	static int[] binarySearch(int matrix[][], int row, int cStart, int cEnd, int target) {
		int mid=0;
		while(cStart <= cEnd) {
			System.out.println("inside");
			mid=cStart+(cEnd-cStart)/2;
			if(matrix[row][mid]==target) {
				return new int[] {row,mid};
			}
			if(matrix[row][mid]<target) {
				cStart=mid+1;
			}
			else {
				cEnd=mid-1;
			}
		}
		
		return new int[]{-1,-1};
	}
	
	static int[] search(int [][] matrix, int target) {
		int rows=matrix.length;
		int cols=matrix[0].length;
		
		if(rows==1) {
			return binarySearch(matrix, 0,0,cols-1,target);
		}
		
		int rStart=0;
		int rEnd=rows-1;
		int cMid=cols/2;
		
		while(rStart<(rEnd-1)) {
			System.out.println("inside row");
			int mid=rStart+((rEnd-rStart)/2);
			if(matrix[mid][cMid]==target) {
				return new int[]{mid,cMid};
			}
			if(matrix[mid][cMid]< target) {
				rStart=mid;
			}
			else {
				rEnd=mid;
			}
		}
		
		//only 2 rows will be left at the end
		
		//1st row
		if(matrix[rStart][cMid]==target) {
			return new int[] {rStart,cMid};
		}
		
		//2nd row
		if(matrix[rStart+1][cMid]==target) {
			return new int[] {rStart+1,cMid};
		}
		
		//1st row
		if(target<= matrix[rStart][cMid-1]) {
			return binarySearch(matrix, rStart,0,cMid-1,target);
		}
		if(target >= matrix[rStart][cMid+1] && target <= matrix[rStart][cols-1]) {
			return binarySearch(matrix,rStart,cMid+1, cols-1, target);
		}
		
		//2nd row
		if(target<= matrix[rStart+1][cMid-1]) {
			return binarySearch(matrix,rStart+1,0,cMid-1,target);
		}
		else{
			return binarySearch(matrix,rStart+1, cMid+1, cols-1,target);
		}
		
	}

}
