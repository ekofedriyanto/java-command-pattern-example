package com.ekofedriyanto.github.command;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class PrimeNumberCommand implements Command {
	@Override
	public long[] execute(int[] arr) {
		if(arr.length != 1)
			throw new RuntimeException("Invalid Data");

		int limit = arr[0];

		return LongStream.iterate(2, i -> i + 1)
				.filter(PrimeNumberCommand::isPrime)
				.limit(limit)
				.toArray();
	}

	public static boolean isPrime(long n) {
		for (long i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
