package Java2;

import okhttp3.internal.http2.ErrorCode;

public class AutomationPracticeRunTimeExce extends RuntimeException {

	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;

	public AutomationPracticeRunTimeExce(String message) {
		super(message);
		System.out.println("I am in constrctor class");
	}

	public AutomationPracticeRunTimeExce(String message, Throwable cause, ErrorCode code) {
		super(message, cause);
	}

	public AutomationPracticeRunTimeExce(String message, Throwable th) {
		super(message,th);

	}

	public AutomationPracticeRunTimeExce(Throwable cause, ErrorCode code) {
		super(cause);

	}
}
