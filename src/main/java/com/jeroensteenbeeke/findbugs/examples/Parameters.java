package com.jeroensteenbeeke.findbugs.examples;

import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class Parameters {
	public static void passNonNullNoop(@Nonnull String param) {

	}

	public static void passNullableNoop(@Nullable String param) {

	}

	public static void passCheckForNullNoop(@CheckForNull String param) {

	}

	public static void passNonNullWithOperation(@Nonnull String param) {
		param.length();
	}

	public static void passNullableWithOperation(@Nullable String param) {
		param.length();
	}

	public static void passCheckForNullWithOperation(@CheckForNull String param) {
		param.length();
	}

}
