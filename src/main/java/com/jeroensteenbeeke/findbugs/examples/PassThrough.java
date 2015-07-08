package com.jeroensteenbeeke.findbugs.examples;

import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class PassThrough {
	public static void passNonNullToNonNullNoop(@Nonnull String param) {
		Parameters.passNonNullNoop(param);
	}

	public static void passNonNullToNonNullOp(@Nonnull String param) {
		Parameters.passNonNullWithOperation(param);
	}

	public static void passCheckForNullToNonNullNoop(@CheckForNull String param) {
		Parameters.passNonNullNoop(param);
	}

	public static void passCheckForNullToNonNullOp(@CheckForNull String param) {
		Parameters.passNonNullWithOperation(param);
	}

	public static void passNullableToNonNullNoop(@Nullable String param) {
		Parameters.passNonNullNoop(param);
	}

	public static void passNullableToNonNullOp(@Nullable String param) {
		Parameters.passNonNullWithOperation(param);
	}
	
	public static void passNonNullToCheckForNullNoop(@Nonnull String param) {
		Parameters.passCheckForNullNoop(param);
	}

	public static void passNonNullToCheckForNullOp(@Nonnull String param) {
		Parameters.passCheckForNullWithOperation(param);
	}

	public static void passCheckForNullToCheckForNullNoop(@CheckForNull String param) {
		Parameters.passCheckForNullNoop(param);
	}

	public static void passCheckForNullToCheckForNullOp(@CheckForNull String param) {
		Parameters.passCheckForNullWithOperation(param);
	}

	public static void passNullableToCheckForNullNoop(@Nullable String param) {
		Parameters.passCheckForNullNoop(param);
	}

	public static void passNullableToCheckForNullOp(@Nullable String param) {
		Parameters.passCheckForNullWithOperation(param);
	}
}
