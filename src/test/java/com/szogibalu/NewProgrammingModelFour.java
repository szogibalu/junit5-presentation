package com.szogibalu;

import org.junit.jupiter.api.*;

import java.util.HashMap;
import java.util.Map;

import static java.time.LocalDateTime.now;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NewProgrammingModelFour {

    private static final String MY_TAG = "my-tag";

	@Test
	@DisplayName("dummy test")
    @Tag(MY_TAG)
	void dummyTest(TestInfo testInfo) {
		assertEquals("dummy test", testInfo.getDisplayName());
        assertTrue(testInfo.getTags().contains(MY_TAG));
	}

	@Test
	void report(TestReporter testReporter) {
		Map<String, String> values = new HashMap<>();
		values.put("user name", "Balu");
		values.put("exection time", now().toString());

		testReporter.publishEntry(values);
	}

}
