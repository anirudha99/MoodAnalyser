package com.moodanalysertest;

import org.junit.Assert;
import org.junit.Test;

import com.moodanalyser.MoodAnalyser;

public class MoodAnalyserTest {

	/**
	 * Test case to check if sad
	 */
	@Test
	public void testSad() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in sad mood");
		String mood = moodAnalyser.analyseMood();
		Assert.assertEquals("SAD", mood);
	}

	/**
	 * Test case to check if happy
	 */
	@Test
	public void testHappy() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in no mood");
		String mood = moodAnalyser.analyseMood();
		Assert.assertEquals("HAPPY", mood);
	}

	/**
	 * Test case handles the null value returns happy
	 */
	@Test
	public void givenNullMoodShouldReturnHappy() {
		MoodAnalyser moodAnalyser = new MoodAnalyser(null);
		String mood = moodAnalyser.analyseMood();
		Assert.assertEquals("HAPPY", mood);

	}

}
