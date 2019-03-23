package com.ekofedriyanto.github;

import com.ekofedriyanto.github.command.Command;
import com.ekofedriyanto.github.command.ExitCommand;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.ExpectedSystemExit;

public class ExitCommandTest {

	private Command exitCommand;

	@Before
	public void setUp() {
		exitCommand = new ExitCommand();
	}

	@Rule
	public ExpectedSystemExit expectedEx = ExpectedSystemExit.none();

	@Test
	public void expectedExitTest() {
		expectedEx.expectSystemExit();
		expectedEx.expectSystemExitWithStatus(0);
		exitCommand.execute(new int[]{});
	}
}
