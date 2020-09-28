package MoodAnalyzer;

import static org.junit.Assert.*;


import org.junit.Test;

public class MoodAnalyzerTest {

	@Test
	public void givenNullMoodShouldReturnHappy(){
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
		String mood = moodAnalyzer.analyzeMood();
		assertEquals("HAPPY", mood);
		
	}

}
