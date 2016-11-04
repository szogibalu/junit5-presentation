package com.szogibalu.extensions;

import static org.junit.jupiter.api.extension.ConditionEvaluationResult.disabled;
import static org.junit.jupiter.api.extension.ConditionEvaluationResult.enabled;

import org.junit.jupiter.api.extension.ConditionEvaluationResult;
import org.junit.jupiter.api.extension.TestExecutionCondition;
import org.junit.jupiter.api.extension.TestExtensionContext;

public class DisabledForTheMeetupExtension implements TestExecutionCondition {

	@Override
	public ConditionEvaluationResult evaluate(TestExtensionContext context) {
		if (isMeetupDay()) {
			return disabled("Volkswagen style");
		} else {
			return enabled("Please fix me");
		}
	}

	private boolean isMeetupDay() {
		return true;
	}

}
