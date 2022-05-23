package leetcode.medium;

import java.util.HashSet;
import java.util.Set;

public class SetMatrixToZero {

	public static void main(String[] args) {
		int[][] matrix = {{0,1}};
		setZeroes(matrix);
		System.out.println("done!!");
	}

	public static void setZeroes(int[][] matrix) {
		Set<Integer> setC = new HashSet<>();
		Set<Integer> setR = new HashSet<>();
		for (int i = 0; i < matrix.length; i++) {
			
			for (int j = 0; j < matrix[i].length; j++) {
				if (setR.contains(i) && setC.contains(j)) {
					continue;
				}
				if (matrix[i][j] == 0) {
					setR.add(i);
					setC.add(j);
				}
			}
		}
		makeColumnRowZero(matrix, setC, setR);
	}

	private static void makeColumnRowZero(int[][] matrix,  Set<Integer> setC, Set<Integer> setR) {
			for (int x : setR) {
				for(int i=0; i<matrix[x].length; i++)
					matrix[x][i] = 0;
				
			}
			
			for (int x : setC) {
				for(int i=0; i<matrix.length; i++)
					matrix[i][x] = 0;
				
			}
		
	}

}
