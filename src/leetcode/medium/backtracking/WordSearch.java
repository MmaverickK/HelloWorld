package leetcode.medium.backtracking;

// https://leetcode.com/problems/word-search/

public class WordSearch {
	
	public static void main(String[] args) {
		char[][] board = {{'Á','B','C','E'},{'S','F','C','S'},{'A','D','E','E'} };
		System.out.println(exist(board, "ABCCED"));
	}
	
	public static boolean exist(char[][] board, String word) {
		for(int i=0; i<board.length; i++) {
			for(int j=0; j<board[i].length; j++) {
//				nbrCheck(board, i, j)
			}
		}
		
		return false;
	}

}
