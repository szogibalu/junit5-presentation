package com.szogibalu;

public class MeetupException extends Exception {

	public MeetupException() {
		super();
	}

	public MeetupException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public MeetupException(String message, Throwable cause) {
		super(message, cause);
	}

	public MeetupException(String message) {
		super(message);
	}

	public MeetupException(Throwable cause) {
		super(cause);
	}

}
