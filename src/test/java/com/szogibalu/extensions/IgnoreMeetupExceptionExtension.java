package com.szogibalu.extensions;

import com.szogibalu.MeetupException;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestExecutionExceptionHandler;

public class IgnoreMeetupExceptionExtension implements TestExecutionExceptionHandler {

	@Override
	public void handleTestExecutionException(ExtensionContext context, Throwable throwable) throws Throwable {

		if (throwable instanceof MeetupException) {
			return;
		}

		throw throwable;
	}
}
