//when not aware about the sorted order of an array(asc/desc)
public class OrderAgnosticBS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = search(new int[] { 60, 45, 39, 28, 19, 7, 2 }, 7);
		System.out.println(result);
		
		int result1=search(new int[] {4,7,9,13,18,30,60}, 9);
		System.out.println(result1);
	}

	static int search(int[] value, int target) {
		int start = 0;
		int end = value.length - 1;
		int mid = 0;

		// sorted order check
		boolean flag = value[start] < value[end];

		while (start <= end) {
			// mid=(start+end)/2; // this may exceed the range of integers
			mid = start + ((end - start) / 2);
			if (value[mid] == target) {
				return mid;
			}
			if (flag) {
				if (value[mid] > target) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			} else {
				if (value[mid] > target) {
					start = mid + 1;

				} else {
					end = mid - 1;
				}
			}
		}

		return -1;

	}

}
