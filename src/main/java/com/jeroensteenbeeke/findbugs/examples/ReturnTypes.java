package com.jeroensteenbeeke.findbugs.examples;

import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class ReturnTypes {
	@Nonnull
	public static String getNonNull() {
		return "Non null";
	}
	
	@Nullable
	public static String getNullable() {
		return null;
	}
	
	@CheckForNull
	public static String getCheckForNull() {
		return null;
	}
	
	@Nullable
	public static String getNullableButNotActuallyNull() {
		return "Nullable";
	}
	
	@CheckForNull
	public static String getCheckForNullButNotActuallyNull() {
		return "CheckForNull";
	}
}
