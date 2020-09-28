package MoodAnalyzer;

import static org.junit.Assert.*;


import org.junit.Test;

public class MoodAnalyzerTest {

	//TC 3.1
	
	@Test
	public void givenNullMoodShouldThrowMoodAnalysisException() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
		String mood = null;
		try {
			mood = moodAnalyzer.analyzeMood();
		}
		catch(MoodAnalysisException e) {
			System.out.println(e.inputType);
			assertEquals(MoodAnalysisException.InputExceptionType.INPUT_NULL, e.inputType);
		}
		
	}
	
	//TC 3.2
	
	@Test
	public void givenEmptyMoodShouldThrowMoodAnalysisException() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("");
		String mood = null;
		try {
			mood = moodAnalyzer.analyzeMood();
		
		}
		catch(MoodAnalysisException e) {
			System.out.println(e.inputType);
			assertEquals(MoodAnalysisException.InputExceptionType.INPUT_EMPTY, e.inputType);
		}
	}

}
