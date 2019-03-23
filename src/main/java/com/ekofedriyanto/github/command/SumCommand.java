package com.ekofedriyanto.github.command;

import java.util.Arrays;

public class SumCommand implements Command {
	@Override
	public long[] execute(int[] arr) {
		if(arr.length < 2)
			throw new RuntimeException("Invalid Data");

		long sum = Arrays.stream(arr).asLongStream().reduce(0, (a, b) -> a + b);
		return new long[]{sum};
	}
}
