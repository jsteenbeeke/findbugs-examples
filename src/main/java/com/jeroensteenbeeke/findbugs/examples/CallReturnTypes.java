package com.jeroensteenbeeke.findbugs.examples;

import org.junit.Test;

public class CallReturnTypes {
	@Test
	public void testNonNull() {
		ReturnTypes.getNonNull().length();
	}

	@Test
	public void testNullable() {
		ReturnTypes.getNullable().length();
	}

	@Test
	public void testCheckForNull() {
		ReturnTypes.getCheckForNull().length();
	}

	@Test
	public void testNullableButNotActuallyNull() {
		ReturnTypes.getNullableButNotActuallyNull().length();
	}

	@Test
	public void testCheckForNullButNotActuallyNull() {
		ReturnTypes.getCheckForNullButNotActuallyNull().length();
	}
}
