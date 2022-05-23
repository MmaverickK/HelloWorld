package leetcode.easy;

//  https://leetcode.com/problems/power-of-three/

public class IsPowerOf3 {
  public static void main(String[] args) {
	System.out.println(isPowerOfThree(8));
}


public static boolean isPowerOfThree(int n) {
    while(n%3 == 0){
        n /= 3;
    }
    if(n ==1) return true;
    else return false;
}

}