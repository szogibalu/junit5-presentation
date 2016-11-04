package com.szogibalu.extensions;

import java.lang.reflect.Method;
import java.util.logging.Logger;

import org.junit.jupiter.api.extension.AfterTestExecutionCallback;
import org.junit.jupiter.api.extension.BeforeTestExecutionCallback;
import org.junit.jupiter.api.extension.ExtensionContext.Namespace;
import org.junit.jupiter.api.extension.ExtensionContext.Store;
import org.junit.jupiter.api.extension.TestExtensionContext;

public class TimingExtension implements BeforeTestExecutionCallback, AfterTestExecutionCallback {

	private static final Logger LOGGER = Logger.getLogger(TimingExtension.class.getName());

	@Override
	public void beforeTestExecution(TestExtensionContext context) throws Exception {
		Method key = context.getTestMethod().get();
		getStore(context).put(key, System.currentTimeMillis());
	}

	@Override
	public void afterTestExecution(TestExtensionContext context) throws Exception {
		Method key = context.getTestMethod().get();

		long start = getStore(context).remove(key, long.class);
		long duration = System.currentTimeMillis() - start;

		LOGGER.info(() -> String.format("Method [%s] took %s ms.", key.getName(), duration));
	}

	private Store getStore(TestExtensionContext context) {
		Namespace namespace = Namespace.create(getClass(), context);
		return context.getStore(namespace);
	}

}
