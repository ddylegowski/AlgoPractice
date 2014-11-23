package com.ddylegowski.algopractice.arrays;

import static org.junit.Assert.*;

import org.junit.Test;

class MakingChangeTest {

	@Test
	public void test_minCoinsForChange_happyPath() {
		int[] coins = [1,5,10,25];
		int total = 11;
		
		int numCoins = MakingChange.minCoinsForChange(coins, total);
		assertEquals(2, numCoins);
	}
	
	@Test
	public void test_minCoinsForChange_1coin() {
		int[] coins = [1];
		int total = 1;
		
		int numCoins = MakingChange.minCoinsForChange(coins, total);
		assertEquals(1, numCoins);
	}

	@Test
	public void test_minCoinsForChange_unableToGetTotal() {
		int[] coins = [10,25];
		int total = 1;
		
		int numCoins = MakingChange.minCoinsForChange(coins, total);
		assertEquals(-1, numCoins);
	}
	
	@Test
	public void test_minCoinsForChange_eachCoinOnce() {
		int[] coins = [1];
		int total = 10;
		
		int numCoins = MakingChange.minCoinsForChange(coins, total);
		assertEquals(10, numCoins);
	}
	
}
