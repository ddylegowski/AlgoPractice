package com.ddylegowski.algopractice;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

class RotateMatrixTest {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testRotateMatrix_3x3() {
		int[][] matrix = [[1, 4, 7], [2, 5, 8], [3, 6, 9]];
		RotateMatrix.rotateMatrix(matrix);
		int[][] expected = [[7,8,9],[4,5,6],[1,2,3]];
		assertMatrix(expected, matrix);
	}
	
	@Test
	public void testRotateMatrix_2x2() {
		int[][] matrix = [[1, 3], [2,4]];
		RotateMatrix.rotateMatrix(matrix);
		int[][] expected = [[3,4], [1,2]];
		assertMatrix(expected, matrix);
	}
	
	@Test
	public void testRotateMatrix_1x1() {
		int[][] matrix = [[1]];
		RotateMatrix.rotateMatrix(matrix);
		int[][] expected = [[1]];
		assertMatrix(expected, matrix);
	}
	
	@Test
	public void testRotateMatrix_empty() {
		int[][] matrix = [[][]];
		RotateMatrix.rotateMatrix(matrix);
		int[][] expected = [[][]];
		assertMatrix(expected, matrix);
	}
	
	private void assertMatrix(int[][] expected, int[][] actual) {
		try {
			for (int i = 0; i < expected.length; ++i) {
				assert expected[i] == actual[i];
			}
		} catch (Exception e) {
			fail("matrix assertion failed");
		}
	}

}
