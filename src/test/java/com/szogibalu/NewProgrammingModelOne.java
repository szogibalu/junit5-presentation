package com.szogibalu;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.szogibalu.annotations.DisabledForTheMeetup;

class NewProgrammingModelOne {

	@BeforeAll
	static void initAll() {
	}

	@BeforeEach
	void init() {
	}

	@AfterEach
	void tearDown() {
	}

	@AfterAll
	static void tearDownAll() {
	}

	@Test
	@DisplayName("Java meetup test")
	@Tag("java_meetup")
	void test() {
	}

	@Test
	@Disabled
	void disabledTest() {
	}

	@Test
	@DisabledForTheMeetup
	void shittyTest() {

	}

}
