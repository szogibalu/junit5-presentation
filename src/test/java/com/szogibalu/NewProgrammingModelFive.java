package com.szogibalu;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.function.Executable;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

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
