package com.szogibalu;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class NewProgrammingModelThree {

	private Service systemUnderTest;

	@Nested
	@DisplayName("Given")
	class Given {

		@Test
		@DisplayName("I am logged in user")
		void user() {
		}

		@Test
		@DisplayName("With 100$")
		void money() {
		}

	}

	@Nested
	@DisplayName("When")
	class When {

		@Test
		@DisplayName("I buy a new game")
		void buy() {
		}
	}

	@Nested
	@DisplayName("Then")
	class Then {

		@Test
		@DisplayName("Game has been ordered")
		void game() {
		}

		@Test
		@DisplayName("I still have 50$")
		void money() {
		}

	}
}
