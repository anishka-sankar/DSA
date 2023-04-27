package Problems;

import java.util.Arrays;

public class RowColMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] result=search(new int [][] {{10,20,30},{16,22,34},{18,27,40}}, 31);
		System.out.println(Arrays.toString(result));
	}
	
	static int[] search(int[][] matrix, int target) {
		int r=0;
		int c=matrix.length-1;
		
		while(r<matrix.length && c>=0 ) {
			if(matrix[r][c]== target) {
				return new int[] {r,c};
			}
			if(matrix[r][c] < target) {
				r++;
			}
			else {
				c--;
			}
		}
		
		return new int[] {-1,-1};
	}

}
