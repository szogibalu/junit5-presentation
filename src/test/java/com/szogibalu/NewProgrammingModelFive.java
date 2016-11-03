package com.szogibalu;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import java.util.stream.Stream;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Executable;
import org.junit.jupiter.api.TestFactory;

public class NewProgrammingModelFive {

	@TestFactory
	Stream<DynamicTest> test() {
		return Stream.of("1", "2", "3").map(number -> {
			String displayName = "Test[" + number + "]";
			Executable executable = () -> assertNotNull(number);

			return dynamicTest(displayName, executable);
		});
	}

}
