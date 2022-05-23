package striver.sdesheet;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*https://takeuforward.org/data-structure/set-matrix-zero
 * i/p : [[1,1,1],[1,0,1],[1,1,1]]
 * o/p : [[1,0,1],[0,0,0],[1,0,1]]
 * 
	*/
public class SetMatrix0 {
	
	public static void main(String[] args) {
//		int[][] matrix = {{1,1,1}, {1,0,1},{1,1,1}};
		int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
		
		doJob(matrix);
		
	}

	private static void doJob(int[][] matrix) {
		Set<Integer> colTo0 = new HashSet<Integer>();
		Set<Integer> rowTo0 = new HashSet<Integer>();
		Instant before = Instant.now();
		// do stuff
		
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[i].length; j++) {
				if(matrix[i][j] == 0) {
					if(!rowTo0.contains(i)) {
						rowTo0.add(i);
					}
					if(!colTo0.contains(j)) {
						colTo0.add(j);
					}
				}
			}
		}
		
		for(Integer row : rowTo0) {
			setRowToZero(matrix, row);
		}

		for(Integer col : colTo0) {
			setColumnToZero(matrix, col);
		}
		Instant after = Instant.now();
		long delta = Duration.between(before, after).toMillis(); 
		System.out.println("dur: "+delta);
		
	}

	private static void setColumnToZero(int[][] matrix, int column) {
		for(int i=0; i<matrix.length; i++) {
			matrix[i][column] = 0;
		}
		
	}

	private static void setRowToZero(int[][] matrix, int row) {
		for(int i=0; i<matrix[row].length; i++) {
			matrix[row][i] = 0;
		}
		
	}
	
	

}
