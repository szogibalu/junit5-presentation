package com.szogibalu;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.expectThrows;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

import org.junit.jupiter.api.Test;

/*
 * Official examples from http://junit.org/junit5/docs/current/user-guide
 */
public class NewProgrammingModelTwo {

	@Test
	void standardAssertions() {
		assertEquals(2, 2);
		assertEquals(4, 4, "The optional assertion message is now the last parameter.");
		assertTrue(2 == 2, () -> "Assertion messages can be lazily evaluated -- "
				+ "to avoid constructing complex messages unnecessarily.");
	}

	@Test
	void groupedAssertions() {
		Address address = new Address("John", "Doe");
		assertAll("address", 
				() -> assertEquals("John", address.getFirstName()),
				() -> assertEquals("Doe", address.getLastName()));
	}

	@Test
	void exceptionTesting() {
		Throwable exception = expectThrows(IllegalArgumentException.class, () -> {
			throw new IllegalArgumentException("a message");
		});
		assertEquals("a message", exception.getMessage());
	}

	@Test
	void testOnlyOnCiServer() {
		assumeTrue("CI".equals(System.getenv("ENV")));
		// remainder of test
	}

	@Test
	void testOnlyOnDeveloperWorkstation() {
		assumeTrue("DEV".equals(System.getenv("ENV")), () -> "Aborting test: not on developer workstation");
		// remainder of test
	}

	@Test
	void testInAllEnvironments() {
		assumingThat("CI".equals(System.getenv("ENV")), () -> {
			// perform these assertions only on the CI server
			assertEquals(2, 2);
		});

		// perform these assertions in all environments
		assertEquals("a string", "a string");
	}

}