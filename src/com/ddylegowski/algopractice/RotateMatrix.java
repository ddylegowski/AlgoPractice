package com.ddylegowski.algopractice;

/**
 * RotateMatrix provides a solution to the problem:
 * Given an NxN matrix, rotate it 90 degrees
 */
public class RotateMatrix {

	/**
	 * Rotates an NxN matrix inplace
	 * It rotates clockwise layer by layer, beginning with the outer layer moving inward
	 * @param matrix
	 */
	public static void rotateMatrix(int[][] matrix) throws Exception {
		
		if (matrix.length == 0) {
			return;
		} else if (matrix[0].length == 0) {
			return;
		} else if (matrix[0].length != matrix.length) {
			throw new Exception("Not an NxN matrix");
		}
		
		int numLayers = matrix.length / 2;
		for (int i = 0; i < numLayers; ++i) {
			int begin = i;
			int end = matrix.length - i - 1;
			
			for (int j = begin; j < end; ++j) {
				int temp = matrix[j][begin];
				matrix[j][begin] = matrix[begin][end-j];
				matrix[begin][end-j] = matrix[end-j][end];
				matrix[end-j][end] =  matrix[end][j];
				matrix[end][j] = temp;
			}
		}
	}
}
