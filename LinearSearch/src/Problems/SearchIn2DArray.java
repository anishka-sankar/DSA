package Problems;

import java.util.Arrays;

public class SearchIn2DArray {

	public static void main(String[] args) {
		int ans [] = search(new int[][] {{3,7,78,45,27},{7,10,2,8,9}, {6,8,4}}, 6);
		System.out.println(Arrays.toString(ans));
		
		//max value
		System.out.println(searchMax(new int[][] {{3,7,78,45,27},{7,10,2,8,9}, {6,8,4}}));
	}
	
	static int[] search(int arr[][], int key) {
		if(arr.length == 0) {
			return new int[]{-1,-1};
		}
		
		for(int i=0; i < arr.length; i++) {
			for(int j=0; j < arr[i].length ; j++) {
				if(arr[i][j] == key) {
					return new int[] {i,j};
				}
			}
		}
		
		return new int[]{-1,-1};
	}
	
	static int searchMax(int arr[][]) {
		if(arr.length == 0) {
			return -1;
		}
		int max=Integer.MIN_VALUE;// min value that an integer type can hold
		//System.out.println(max);
		for(int[] i:arr) {
			for(int j:i) {
				if(j > max) {
					max=j;
				}
			}
		}
		
		return max;
	}
	
	

}
