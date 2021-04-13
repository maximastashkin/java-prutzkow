package ru.rsreu.astashkin0504;

import com.prutzkow.resourcer.Resourcer;

/**
 * Utility class for generating random integers in a range
 * 
 * @author Maxim Astashkin
 */
public class RandomRangeGenerator {

	/**
	 * Default private constructor - so that you cannot create instances of the
	 * utility class.
	 */
	private RandomRangeGenerator() {

	}

	/**
	 * @param min - lower bound for generating random numbers (inclusive).
	 * @param max - higher bound for generating random numbers (inclusive).
	 * @return random integer number in a range [min, max] inclusive.
	 * @throws IllegalArgumentException in case if min more than max.
	 */
	public static float getRandomByRange(float min, float max) throws IllegalArgumentException {
		if (min > max) {
			throw new IllegalArgumentException(Resourcer.getString("error.message.minMoreThanMax"));
		}
		return min + (int) (Math.random() * (max - min + 1));
	}
}