package com.ddylegowski.algopractice.arrays

/**
 * MakingChange provides a solution to the problem:
 * Given a list of N coins, their values (V1, V2, ... , VN), and the total sum S. Find the minimum number of coins the sum 
 * of which is S (we can use as many coins of one type as we want), or report that it's not possible to select coins in such 
 * a way that they sum up to S. 
 */
class MakingChange {

	/**
	 * This algorithm using dynamic programming by calculating and storing the minimum number of coins for each value up to total.
	 * If no coin equals the index value i, use the previous index and add the current coin, until i is reached (or is unable to be reached).
	 * @param matrix
	 * @return
	 */
	static int minCoinsForChange(int[] coins, int total) {
		
		if (total == 0) {
			return 0;
		}
		
		int[] minCoinsToTotal = new int[total+1];	//array to contain the min # coins used to add up to i
		minCoinsToTotal[0]=0;
		
		int curTotal = 0;
		for (i in 1..minCoinsToTotal.length-1) {	//for each i, try to get the min # coins summing to value i
			minCoinsToTotal[i]=-1;
			curTotal = 0;
			for (j in 0..coins.length-1) {
				if (coins[j] == i) {	//the coin == i, so 1 is the min
					minCoinsToTotal[i] = 1;
					curTotal = i;
					break;
				} else if (coins[j] > i) {
					continue;
				} else {	//try adding the coin
					int tempSum = i-1+coins[j];
					if (tempSum == i) {
						minCoinsToTotal[i] = minCoinsToTotal[i-1] + 1;
						curTotal = i;
					} else if (tempSum < i) {
						minCoinsToTotal[i] = minCoinsToTotal[i-1] + 1;
						curTotal += coins[j];
					}
					
				}
			}
			
			//we cannot sum up to i
			if (curTotal != i) {
				minCoinsToTotal[i] = -1;
			}
		}
		
		return minCoinsToTotal[minCoinsToTotal.length-1];
	}
}
