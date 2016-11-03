package com.szogibalu;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class NewProgrammingModelThree {

	private Servlet systemUnderTest;

	@Nested
	@DisplayName("Init")
	class Given {

		@Test
		@DisplayName("Servlet created")
		void created() {
		}

		@Test
		@DisplayName("Servlet initialized")
		void initialized() {
		}

	}

	@Nested
	@DisplayName("Service")
	class When {

		@Test
		@DisplayName("Getting Information from Requests")
		void getting() {
		}

		@Test
		@DisplayName("Constructing Responses")
		void constructing() {
		}
	}

	@Nested
	@DisplayName("Destroy")
	class Then {

		@Test
		@DisplayName("Servlet removed")
		void removed() {
		}

	}
}
