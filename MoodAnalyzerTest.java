package MoodAnalyzer;

import static org.junit.Assert.*;


import org.junit.Test;

public class MoodAnalyzerTest {

	@Test
	public void testMoodAnalyzer_TC1_1(){
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Sad Mood");
		String mood = moodAnalyzer.analyzeMood();
		assertEquals("SAD", mood);
	}
	
	@Test
	public void testMoodAnalyzer_TC1_2(){
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Any Mood");
		String mood = moodAnalyzer.analyzeMood();
		assertEquals("HAPPY", mood);
	}
	
	

}
