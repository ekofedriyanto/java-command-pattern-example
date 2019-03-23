package com.ekofedriyanto.github.command;

import java.util.Arrays;

public class MultiplyCommand implements Command {
	@Override
	public long[] execute(int[] arr) {
		if(arr.length < 2)
			throw new RuntimeException("Invalid Data");

		long multiply = Arrays.stream(arr).asLongStream().reduce(1, (a, b) -> a * b);
		return new long[]{multiply};
	}
}
