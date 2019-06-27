package testProject.test;

public class PalindromeSolution {

	private static boolean canMakeAPalindrome(String testStr) {
		int[] frequencyArr = createFrequencyArray(testStr);
        //  System.out.println(frequencyArr+"frequency");
		int oddCharCount = 0;

		for (int count : frequencyArr) {
			//System.out.println(frequencyArr[0]+"ch");
			// Count characters with odd occurrence.
			if (count % 2 != 0)
				oddCharCount++;

			// If more than one character in the string has odd occurrence then
			// palindrome cannot be formed from given string
			if (oddCharCount > 1)
				return false;
		}

		return true;
	}

	private static int[] createFrequencyArray(String testStr) {
		int[] frequencyArr = new int[256];
       
		char[] charArray = testStr.toCharArray();
        String a="a";
		for (char ch : charArray){
			frequencyArr[ch]=frequencyArr[ch]+1;
			System.out.println(frequencyArr[ch]);
		}
		System.out.println(frequencyArr+"frequency");
		return frequencyArr;
	}

	public static void main(String[] args) {
		String testStr = "ktkktwt";

		System.out.println("Can palindrome be formed from '" + testStr
				+ "' ? : " + canMakeAPalindrome(testStr));
	}
}