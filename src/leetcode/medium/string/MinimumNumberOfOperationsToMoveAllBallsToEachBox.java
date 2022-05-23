package leetcode.medium.string;

public class MinimumNumberOfOperationsToMoveAllBallsToEachBox {

	public static void main(String[] args) {
		int[] answer = minOperations("001011");
		System.out.println("an");
	}
	
	
	public static int[] minOperations(String boxes) {
		int[] answer = new int[boxes.length()];
		for(int i=0; i<boxes.length(); i++) {
			int minOper = 0;
			for(int j=0; j<boxes.length(); j++) {
				if(i != j && Character.toString(boxes.charAt(j)).equals("1")) {
					minOper += Math.abs(i-j);
				}
			}
			answer[i] = minOper;
		}
		return answer;
	}
}
