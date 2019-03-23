package com.ekofedriyanto.github;

import com.ekofedriyanto.github.command.Command;
import com.ekofedriyanto.github.command.PrimeNumberCommand;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class PrimeNumberCommandTest {

	private Command primeNumberCommand;

	@Before
	public void setUp() {
		primeNumberCommand = new PrimeNumberCommand();
	}

	@Rule
	public ExpectedException expectedEx = ExpectedException.none();

	@Test
	public void expectedExceptionZeroArgumentTest() {
		expectedEx.expect(RuntimeException.class);
		expectedEx.expectMessage("Invalid Data");
		primeNumberCommand.execute(new int[]{});
	}

	@Test
	public void expectedExceptionMoreThanOneArgumentTest() {
		expectedEx.expect(RuntimeException.class);
		expectedEx.expectMessage("Invalid Data");
		primeNumberCommand.execute(new int[]{1,2});
	}

	@Test
	public void isPrimeTest() {
		Assert.assertTrue(PrimeNumberCommand.isPrime(2) );
	}

	@Test
	public void commandTest() {
		Assert.assertArrayEquals( new long[]{2, 3, 5, 7}, primeNumberCommand.execute(new int[]{4}));
		Assert.assertArrayEquals( new long[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199}, primeNumberCommand.execute(new int[]{46}));
	}
}
