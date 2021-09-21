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
	
	public MoodAnalyser() {
		this.message = null;
	}

	/**
	 * @param message
	 * @return string SAD if message has sad else HAPPY,
	 * if null then happy is returned
	 */
	public String analyseMood() {
		try {
			if(message.contains(("sad"))){
				return "SAD";
			}else {
				return "HAPPY";
			}
		}catch(NullPointerException e) {
			return "HAPPY";
		}

	}

}
