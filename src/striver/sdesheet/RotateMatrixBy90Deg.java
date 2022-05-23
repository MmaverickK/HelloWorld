package striver.sdesheet;

public class RotateMatrixBy90Deg {
	
	public static void main(String[] args) {
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		doJob(matrix);
	}
	
	public static void doJob(int[][] matrix) {
		int n = matrix.length;
		int[][] rotatedMatrix = new int[n][n];
		for ( int i=0; i<n; i++) {
			for (int j=0; j<matrix[i].length; j++) {
				rotatedMatrix[i][j] = matrix[n-j-1][i];
			}
		}
		System.out.println(rotatedMatrix);
	}

}
