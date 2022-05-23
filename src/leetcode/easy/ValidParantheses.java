package leetcode.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParantheses {

	public static void main(String[] args) {
		System.out.println(isValid("(){}}{"));
	}
	
	
	public static boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        Map<Character, Character> map = new  HashMap<Character, Character>();
//        map.put('(',')');
        map.put(')','(');
//        map.put('{','}');
        map.put('}','{');
//        map.put('[',']');
        map.put(']','[');
        
        
        
//        if(s.length() == 1) return false;
        for(int i=0; i<s.length(); i++){
            if(!stk.isEmpty() && stk.peek()==map.get(s.charAt(i))){
                stk.pop();
            }else {
            	stk.push(s.charAt(i));
            }
            
        }
        if(stk.isEmpty()) return true;
        else return false;
    }
}
