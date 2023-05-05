import java.util.stream.Stream;

//The sorting happens in single iteration. The given array list will be in the range 1 to N. Hence in each index the value will be checked and swapped at correct index.
//Best and worst time complexity O(N).
public class CyclicSort {
public static void main(String[] args) {
	Integer[] arr=new Integer[] {5,4,1,2,3};
	int i=0;
	while(i<arr.length) {
		int correctValue = i+1;
		if(arr[i] != correctValue) {
			swap(arr,i,arr[i]-1);
		}
		else {
			i++;
		}
	}
	
	
	Stream.of(arr).forEach(System.out::println);
	
}

private static void swap(Integer[] arr, int i, int j) {
	// TODO Auto-generated method stub
	int temp=arr[i];
	arr[i]=arr[j];
	arr[j]=temp;
}
}
