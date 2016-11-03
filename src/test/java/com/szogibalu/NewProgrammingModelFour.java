package com.szogibalu;

import static java.time.LocalDateTime.now;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestReporter;

public class NewProgrammingModelFour {

	@Test
	@DisplayName("dummy test")
	@Tag("my tag")
	void dummyTest(TestInfo testInfo) {
		assertEquals("dummy test", testInfo.getDisplayName());
		assertTrue(testInfo.getTags().contains("my tag"));
	}

	@Test
	void report(TestReporter testReporter) {
		Map<String, String> values = new HashMap<>();
		values.put("user name", "Balu");
		values.put("exection time", now().toString());

		testReporter.publishEntry(values);
	}

}
