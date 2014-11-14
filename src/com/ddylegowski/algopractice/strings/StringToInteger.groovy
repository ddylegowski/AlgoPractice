package com.ddylegowski.algopractice.strings

/**
 * StringToInteger solves the problem:
 * Given an integer as a string, return the value as an integer.
 *
 */
class StringToInteger {

	//error messages for ArithmeticException
	public static final String INVALID_CHAR = "Character is not a numerical digit";
	public static final String EMPTY_INPUT = "Cannot convert an empty string to an integer";
	
	/**
	 * Return the int value represented by the string.
	 * The time complexity of this algorithm is O(N)
	 * @param string
	 * @return
	 */
	public static int stringToInteger(String string) {
		
		if (string.isEmpty()) {
			throw new ArithmeticException(EMPTY_INPUT);
		}
		
		int value = 0;
		boolean negative = string.charAt(0) == '-';
		for (int i = (negative ? 1 : 0); i < string.size(); ++i) {
			value = (value*10) + charToInt(string.charAt(i));
		}
		
		if (negative == true) {
			value = value*-1;
		}
		
		return value;
	}
	
	/**
	 * Given an int as a char, return the int value
	 * @param c
	 * @return
	 */
	private static int charToInt(char c) {
		int ascii = (int)c;
		if (ascii < 48 || ascii > 57) {
			throw new ArithmeticException(INVALID_CHAR);
		}
		
		return ascii - 48;
	}
	
}
