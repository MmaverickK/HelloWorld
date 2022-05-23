package leetcode.medium.string;

public class ReverseWords {
	
	public static void main(String[] args) {
		System.out.println(reverseWords("a good   example"));
	}
	
	public static String reverseWords(String s) {
		s = s.trim().replaceAll(" +", " ");
		String[] split = s.split(" ");
		String reverse = "";
		for(int i=split.length -1; i>= 0; i--) {
			reverse = reverse.concat(split[i]);
			if(i>0) {
				reverse = reverse.concat(" ");
			}
		}
		return reverse;
	}

}
