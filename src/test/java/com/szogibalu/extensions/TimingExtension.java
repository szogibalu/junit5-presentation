package com.szogibalu.extensions;

import org.junit.jupiter.api.extension.AfterTestExecutionCallback;
import org.junit.jupiter.api.extension.BeforeTestExecutionCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ExtensionContext.Namespace;
import org.junit.jupiter.api.extension.ExtensionContext.Store;

import java.lang.reflect.Method;
import java.util.logging.Logger;

public class TimingExtension implements BeforeTestExecutionCallback, AfterTestExecutionCallback {

	private static final Logger LOGGER = Logger.getLogger(TimingExtension.class.getName());

	@Override
	public void beforeTestExecution(ExtensionContext context) throws Exception {
		Method key = context.getTestMethod().get();
		getStore(context).put(key, System.currentTimeMillis());
	}

	@Override
	public void afterTestExecution(ExtensionContext context) throws Exception {
		Method key = context.getTestMethod().get();

		long start = getStore(context).remove(key, long.class);
		long duration = System.currentTimeMillis() - start;

		LOGGER.info(() -> String.format("Method [%s] took %s ms.", key.getName(), duration));
	}

	private Store getStore(ExtensionContext context) {
		Namespace namespace = Namespace.create(getClass(), context);
		return context.getStore(namespace);
	}

}
