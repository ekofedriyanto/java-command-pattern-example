package com.ekofedriyanto.github.command;

import java.util.stream.Stream;

public class FibonacciCommand implements Command {
	@Override
	public long[] execute(int[] arr) {
		if(arr.length != 1)
			throw new RuntimeException("Invalid Data");

		int limit = arr[0];

		return Stream.iterate(new long[]{0, 1}, i -> new long[]{i[1], i[0] + i[1]}).limit(limit).mapToLong(s -> s[0]).toArray();
	}
}
