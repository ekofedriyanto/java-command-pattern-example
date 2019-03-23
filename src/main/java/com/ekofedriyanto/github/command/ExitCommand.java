package com.ekofedriyanto.github.command;

public class ExitCommand implements Command {
	@Override
	public long[] execute(int[] arr) {
		System.exit(0);
		return new long[]{};
	}
}
