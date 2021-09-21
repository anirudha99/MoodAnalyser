package com.moodanalysertest;

import org.junit.Assert;
import org.junit.Test;

import com.moodanalyser.MoodAanalyserException;
import com.moodanalyser.MoodAnalyser;

public class MoodAnalyserTest {

	/**
	 * Test case to check if sad
	 */
	@Test
	public void testSad() {
		try {
			MoodAnalyser moodAnalyser = new MoodAnalyser("I am in sad mood");
			String mood = moodAnalyser.analyseMood();
			Assert.assertEquals("SAD", mood);
		} catch (MoodAanalyserException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Test case to check if happy
	 */
	@Test
	public void testHappy() {
		try {
			MoodAnalyser moodAnalyser = new MoodAnalyser("I am in no mood");
			String mood = moodAnalyser.analyseMood();
			Assert.assertEquals("HAPPY", mood);
		} catch (MoodAanalyserException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Test case handles the null value returns happy
	 */
	@Test
	public void givenNullMoodShouldReturnHappy() {
		try {
			MoodAnalyser moodAnalyser = new MoodAnalyser(null);
			String mood = moodAnalyser.analyseMood();
			Assert.assertEquals("HAPPY", mood);
		} catch (MoodAanalyserException e) {
			e.printStackTrace();
		}
	}
}
