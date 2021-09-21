package com.moodanalysertest;

import org.junit.Assert;
import org.junit.Test;

import com.moodanalyser.MoodAnalyser;

public class MoodAnalyserTest {
	
	@Test
	public void testSad() {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood = moodAnalyser.analyseMood("I am in sad mood");
		Assert.assertEquals("SAD", mood);
	}
	
	@Test
	public void testHappy() {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String mood = moodAnalyser.analyseMood("I am in Any mood");
		Assert.assertEquals("HAPPY", mood);
	}

}
