package Problems;

public class SearchInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(search1("switzerland",'l'));
		System.out.println(search2("switzerland",'l'));
	}
	
	static boolean search1(String value, Character key) {
		//return value.contains(key.toString()); //using inbuilt method contains
		if(value.length()==0) {
			return false;
		}
		for(int i=0;i<value.length();i++) {
			if(value.charAt(i)==key) {
				return true;
			}
		}
		
		return false;
		
	}
	
	
	static boolean search2(String value, Character key) {
	
		if(value.length()==0) {
			return false;
		}
		for(Character c:value.toCharArray()) {
			if(c==key) {
				return true;
			}
		}
		
		return false;
		
	}

}
