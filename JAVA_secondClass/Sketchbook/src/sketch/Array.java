package sketch;

public class Array {
	public static void main(String[] args) {
		int [] arNums = {1,2,3,4};
		System.out.println(arNums);
		
		char [] arChars = {'��','��','��','��'};
		System.out.println(arChars);
		
		
		String [] arStrings = {"������", "��2423"};
		System.out.println(arStrings);
		
		

		
		String result = "";
		for (int i = 0; i < arNums.length; i++) {
			result += arNums[i]+"";
		}
		System.out.println(result);
		
		
	}
}
