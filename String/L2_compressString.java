public class Test {
	public static void main(String[] args){
		Strng input = "aaaabbbcc"
		System.out.println("result is:" + compressString(input))
	}

	public static String compressString(String string){
		if(string == null || string.length() == 0){
			return new String();
		}

		StringBuilder sb = new StringBuilder();
		int len = string.length();
		char[] arrString = string.toCharArray();
		char prev = arrString[0];
		int count = 1;

		for(int i = 1; i < len; i++){
			char cur = arrString[i];
			if(prev == cur){
				count++;
			} else {
				sb.append(count).append(prev);
				// reset
				count = 1;
				prev = cur;
			}
		}

		sb.append(count).append(prev);

		return sb.toString();
	}
}
