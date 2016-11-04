package com.szogibalu.extensions;

import org.junit.jupiter.api.extension.TestExecutionExceptionHandler;
import org.junit.jupiter.api.extension.TestExtensionContext;

import com.szogibalu.MeetupException;

public class IgnoreMeetupExceptionExtension implements TestExecutionExceptionHandler {

	@Override
	public void handleTestExecutionException(TestExtensionContext context, Throwable throwable) throws Throwable {

		if (throwable instanceof MeetupException) {
			return;
		}

		throw throwable;
	}
}
