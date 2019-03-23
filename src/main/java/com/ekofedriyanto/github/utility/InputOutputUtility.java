package com.ekofedriyanto.github.utility;

import java.util.Arrays;
import java.util.stream.Collectors;

public class InputOutputUtility {

	public static String trimString(String src, String delimiter) {
		return src.replaceAll("[^a-zA-Z0-9" + delimiter + "]", "");
	}

	public static int stringToInt(String src) {
		final String number = trimString(src,"");
		return Integer.parseInt(number);
	}

	public static int[] stringToIntArray(String src, String delimiter ) {
		return Arrays.stream(trimString(src, delimiter).split(delimiter))
				.mapToInt(InputOutputUtility::stringToInt)
				.toArray();
	}

	public static String intArrayToString(int[] src, String delimiter ) {
		return  Arrays.stream(src)
				.mapToObj(String::valueOf)
				.collect(Collectors.joining(delimiter));
	}

}
