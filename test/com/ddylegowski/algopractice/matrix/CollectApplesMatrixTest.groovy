package com.ddylegowski.algopractice.matrix;

import static org.junit.Assert.*;

import org.junit.Test;

class CollectApplesMatrixTest {

	@Test
	public void test_collectMaxApples_happyPath() {
		int[][] matrix = [[1, 4, 7], [2, 5, 8], [3, 6, 9]];
		int maxApples = CollectApplesMatrix.collectMaxApples(matrix);
		assertEquals(29, maxApples);
	}

	@Test
	public void test_collectMaxApples_1x1() {
		int[][] matrix = [[1]];
		int maxApples = CollectApplesMatrix.collectMaxApples(matrix);
		assertEquals(1, maxApples);
	}
	
	@Test
	public void test_collectMaxApples_empty() {
		int[][] matrix = [[]];
		int maxApples = CollectApplesMatrix.collectMaxApples(matrix);
		assertEquals(0, maxApples);
	}
	
	@Test
	public void test_collectMaxApples_MxN() {
		int[][] matrix = [[1, 5], [2, 6], [3, 7], [4,8]];
		int maxApples = CollectApplesMatrix.collectMaxApples(matrix);
		assertEquals(27, maxApples);
	}
}
