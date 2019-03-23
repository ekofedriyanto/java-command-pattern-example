package com.ekofedriyanto.github;

import com.ekofedriyanto.github.command.Command;
import com.ekofedriyanto.github.command.SumCommand;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class SumCommandTest {

	private Command sumCommand;

	@Before
	public void setUp() {
		sumCommand = new SumCommand();
	}

	@Rule
	public ExpectedException expectedEx = ExpectedException.none();

	@Test
	public void expectedExceptionZeroArgumentTest() {
		expectedEx.expect(RuntimeException.class);
		expectedEx.expectMessage("Invalid Data");
		sumCommand.execute(new int[]{});
	}

	@Test
	public void expectedExceptionOneArgumentTest() {
		expectedEx.expect(RuntimeException.class);
		expectedEx.expectMessage("Invalid Data");
		sumCommand.execute(new int[]{});
	}

	@Test
	public void commandTest() {
		Assert.assertArrayEquals( new long[]{3}, sumCommand.execute(new int[]{1, 2}) );
		Assert.assertArrayEquals( new long[]{6}, sumCommand.execute(new int[]{1, 2, 3}) );
		Assert.assertArrayEquals( new long[]{-3}, sumCommand.execute(new int[]{-1, -2}) );
		Assert.assertArrayEquals( new long[]{-6}, sumCommand.execute(new int[]{-1, -2, -3}) );
		Assert.assertArrayEquals( new long[]{4}, sumCommand.execute(new int[]{-1, 2, 3}) );
	}
}
