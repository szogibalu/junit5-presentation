package com.szogibalu;

import static java.lang.Thread.sleep;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import com.szogibalu.annotations.DisabledForTheMeetup;
import com.szogibalu.extensions.IgnoreMeetupExceptionExtension;
import com.szogibalu.extensions.TimingExtension;

@ExtendWith({ TimingExtension.class, IgnoreMeetupExceptionExtension.class })
public class NewExtensionModel {

	@DisabledForTheMeetup
	void flakyTest() {
	}

	@Test
	void sleep20ms() throws Exception {
		sleep(20);
	}

	@Test
	void sleep50ms() throws Exception {
		sleep(50);
	}

	@Test
	void notGoodTest() throws MeetupException {
		throw new MeetupException("This meetup should be ended soon");
	}

}
