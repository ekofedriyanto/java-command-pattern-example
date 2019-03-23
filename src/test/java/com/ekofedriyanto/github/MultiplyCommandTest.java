package com.ekofedriyanto.github;

import com.ekofedriyanto.github.command.Command;
import com.ekofedriyanto.github.command.MultiplyCommand;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MultiplyCommandTest {

	private Command multiplyCommand;

	@Before
	public void setUp() {
		multiplyCommand = new MultiplyCommand();
	}

	@Rule
	public ExpectedException expectedEx = ExpectedException.none();

	@Test
	public void expectedExceptionZeroArgumentTest() {
		expectedEx.expect(RuntimeException.class);
		expectedEx.expectMessage("Invalid Data");
		multiplyCommand.execute(new int[]{});
	}

	@Test
	public void expectedExceptionOneArgumentTest() {
		expectedEx.expect(RuntimeException.class);
		expectedEx.expectMessage("Invalid Data");
		multiplyCommand.execute(new int[]{});
	}

	@Test
	public void commandTest() {
		Assert.assertArrayEquals( new long[]{2}, multiplyCommand.execute(new int[]{1, 2}) );
		Assert.assertArrayEquals( new long[]{6}, multiplyCommand.execute(new int[]{1, 2, 3}) );
		Assert.assertArrayEquals( new long[]{2}, multiplyCommand.execute(new int[]{-1, -2}) );
		Assert.assertArrayEquals( new long[]{-6}, multiplyCommand.execute(new int[]{-1, -2, -3}) );
		Assert.assertArrayEquals( new long[]{-6}, multiplyCommand.execute(new int[]{-1, 2, 3}) );
	}
}
