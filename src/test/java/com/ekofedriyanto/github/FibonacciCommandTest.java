package com.ekofedriyanto.github;

import com.ekofedriyanto.github.command.Command;
import com.ekofedriyanto.github.command.FibonacciCommand;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class FibonacciCommandTest {

	private Command fibonacciCommand;

	@Before
	public void setUp() {
		fibonacciCommand = new FibonacciCommand();
	}

	@Rule
	public ExpectedException expectedEx = ExpectedException.none();

	@Test
	public void expectedExceptionZeroArgumentTest() {
		expectedEx.expect(RuntimeException.class);
		expectedEx.expectMessage("Invalid Data");
		fibonacciCommand.execute(new int[]{});
	}

	@Test
	public void expectedExceptionMoreThanOneArgumentTest() {
		expectedEx.expect(RuntimeException.class);
		expectedEx.expectMessage("Invalid Data");
		fibonacciCommand.execute(new int[]{1,2});
	}

	@Test
	public void commandTest() {
		Assert.assertArrayEquals( new long[]{0, 1, 1, 2}, fibonacciCommand.execute(new int[]{4}));
		Assert.assertArrayEquals( new long[]{0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811}, fibonacciCommand.execute(new int[]{29}));
	}
}
