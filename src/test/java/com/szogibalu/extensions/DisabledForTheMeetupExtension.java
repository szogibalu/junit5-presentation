package com.szogibalu.extensions;

import org.junit.jupiter.api.extension.ConditionEvaluationResult;
import org.junit.jupiter.api.extension.ExecutionCondition;
import org.junit.jupiter.api.extension.ExtensionContext;

import static org.junit.jupiter.api.extension.ConditionEvaluationResult.disabled;
import static org.junit.jupiter.api.extension.ConditionEvaluationResult.enabled;

public class DisabledForTheMeetupExtension implements ExecutionCondition {

	@Override
    public ConditionEvaluationResult evaluateExecutionCondition(ExtensionContext context) {
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
