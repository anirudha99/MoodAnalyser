package com.moodanalyser;

/**
 * @author anirudhasm Class to check the mood of the user
 *
 */
public class MoodAnalyser {

	String message;

	public MoodAnalyser(String message) {
		this.message = message;
	}


	/**
	 * @param message
	 * @return string SAD if message has sad else HAPPY
	 */
	public String analyseMood() {
		if(message.contains(("sad"))){
			return "SAD";
		}else {
			return "HAPPY";
		}
	}

}
