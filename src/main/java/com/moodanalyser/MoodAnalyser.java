package com.moodanalyser;

/**
 * @author anirudhasm Class to check the mood of the user
 *
 */
public class MoodAnalyser {

	/**
	 * @author anirudhasm error types
	 *
	 */
	public enum errors {
		EMPTY_MOOD_ERROR,NULL_MOOD_ERROR
	}

	String message;

	public MoodAnalyser(String message) {
		this.message = message;
	}

	public MoodAnalyser() {
		this.message = null;
	}

	/**
	 * @param message
	 * @return string SAD if message has sad else HAPPY,
	 * if null then error is given
	 * custom exception is added
	 */
	public String analyseMood() throws MoodAanalyserException{
		if (message == null) {
			throw new MoodAanalyserException(errors.NULL_MOOD_ERROR.toString());
		}
		if (message.length() == 0) {
			throw new MoodAanalyserException(errors.EMPTY_MOOD_ERROR.toString());
		}
		if (message.contains("sad")) {
			return "SAD";
		}
		else {
			return "HAPPY";
		}
	}

}
