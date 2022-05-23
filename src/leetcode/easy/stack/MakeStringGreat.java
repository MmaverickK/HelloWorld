package leetcode.easy.stack;

import java.util.Stack;


//  https://leetcode.com/problems/make-the-string-great/
public class MakeStringGreat {

	public static void main(String[] args) {
		String ans = makeGood("abBAcC");
		System.out.println("done");
	}

	public static String makeGood(String s) {
		return doJob(s);
	}

	private static String doJob(String s) {
//		StringBuilder sbr = new StringBuilder(s);
//		for (int i = 0; i < sbr.length() - 1; i++) {
//			if ((Character.toLowerCase(sbr.charAt(i) ) == Character.toLowerCase(sbr.charAt(i+1) ) && Character.isLowerCase(sbr.charAt(i)) && Character.isUpperCase(sbr.charAt(i + 1)))
//					|| (Character.toLowerCase(sbr.charAt(i) ) == Character.toLowerCase(sbr.charAt(i+1) ) && Character.isUpperCase(sbr.charAt(i)) && Character.isLowerCase(sbr.charAt(i + 1)))) {
//				sbr.delete(i, i+2);
//				i = -1;
//			}
//		}
//		return new String(sbr);
		
		
		Stack<Character> st= new Stack<>();
	    char[] chars= s.toCharArray();
	    for(int i=0;i<chars.length;i++){
	        char currLetter=chars[i];
	        if(!st.isEmpty()){
	            char top=st.peek();
	            int topLetter=top;
	             if( (currLetter+32)==top || (currLetter-32)==top){
	                st.pop();
	            }else{
	                st.push(currLetter);
	            }
	        }else{
	            st.push(currLetter);
	        }

	    }
	    StringBuilder sb= new StringBuilder();
	    for(char s1:st){
	        sb.append(Character.toString(s1));
	    }
	    return sb.toString();
	}
}
