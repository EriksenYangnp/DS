package C11_hash;

public class P424 {
	
	public static int hashFunc1(String key) {
		int hashVal = 0;
		int pow27 = 1;
		
		for(int j=key.length()-1; j>=0; j--) {
			int letter = key.charAt(j) - 96;
			hashVal += pow27 * letter;
			pow27 *= 27;
		}
		return hashVal % arraySize;
	}
}
