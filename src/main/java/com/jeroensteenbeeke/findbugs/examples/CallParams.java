package com.jeroensteenbeeke.findbugs.examples;

import org.junit.Test;

public class CallParams {
	@Test
	public void testNonNullNoopWithNullParam() {
		// Null passed for non-null parameter
		Parameters.passNonNullNoop(null);
	}
	
	@Test
	public void testNonNullOpWithNullParam() {
		// Null passed for non-null parameter
		Parameters.passNonNullWithOperation(null);
	}
	
	@Test
	public void testNonNullNoopWithRealParam() {
		Parameters.passNonNullNoop("NonNull");
	}
	
	@Test
	public void testNonNullOpWithRealParam() {
		Parameters.passNonNullWithOperation("NonNull");
	}
	
	@Test
	public void testNullableNoopWithNullParam() {
		Parameters.passNullableNoop(null);
	}
	
	@Test
	public void testNullableOpWithNullParam() {
		Parameters.passNullableWithOperation(null);
	}
	
	@Test
	public void testNullableNoopWithRealParam() {
		Parameters.passNullableNoop("Nullable");
	}
	
	@Test
	public void testNullableOpWithRealParam() {
		Parameters.passNullableWithOperation("Nullable");
	}
	
	@Test
	public void testCheckForNullNoopWithNullParam() {
		Parameters.passCheckForNullNoop(null);
	}
	
	@Test
	public void testCheckForNullOpWithNullParam() {
		Parameters.passCheckForNullWithOperation(null);
	}
	
	@Test
	public void testCheckForNullNoopWithRealParam() {
		Parameters.passCheckForNullNoop("CheckForNull");
	}
	
	@Test
	public void testCheckForNullOpWithRealParam() {
		Parameters.passCheckForNullWithOperation("CheckForNull");
	}
}
