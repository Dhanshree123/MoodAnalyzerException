package MoodAnalyzer;

import static org.junit.Assert.*;


import org.junit.Test;

public class MoodAnalyzerTest {

	@Test
	public void testMoodAnalyzer_TC1_1(){
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
		String mood = moodAnalyzer.analyzeMood("I am in Sad Mood");
		assertEquals("SAD", mood);
	}
	
	@Test
	public void testMoodAnalyzer_TC1_2(){
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
		String mood = moodAnalyzer.analyzeMood("I am in Any Mood");
		assertEquals("HAPPY", mood);
	}
	
	

}
