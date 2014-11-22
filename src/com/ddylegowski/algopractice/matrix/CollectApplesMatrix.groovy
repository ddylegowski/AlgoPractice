package com.ddylegowski.algopractice.matrix;


/**
 * CollectApplesMatrix provides a solution to the problem:
 * A table composed of N x M cells, each having a certain quantity of apples, is given. You start from the upper-left corner. 
 * At each step you can go down or right one cell. Find the maximum number of apples you can collect. 
 *
 */
class CollectApplesMatrix {

	/**
	 * This algorithm using dynamic programming by calculating and storing the maximum number of apples collected
	 * at each position.
	 * @param matrix
	 * @return
	 */
	static int collectMaxApples(int[][] matrix) {
		
		int numCols = matrix.length;
		int numRows = matrix[0].length;
		if (numRows == 0) return 0;
		
		//matrix to store all the current num apples
		int[][] totalsMatrix = new int[numCols][numRows];
		
		for (i in 0..numCols-1) {
			for (j in 0..numRows-1) {
				//get the previously calculated values if they exist
				int leftSum = i > 0 ? totalsMatrix[i-1][j] : 0;
				int upSum = j > 0 ? totalsMatrix[i][j-1] : 0;
				
				totalsMatrix[i][j] = matrix[i][j] + Math.max(leftSum, upSum);
			}
		}
		
		return totalsMatrix[numCols-1][numRows-1];
	}

}
