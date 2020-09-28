package MoodAnalyzer;

public class MoodAnalyzer {
private String msg;
	
	public String analyzeMood(String msg) {
		
			if(msg.toLowerCase().contains("sad"))
				return "SAD";
			else
				return "HAPPY";
		
	}

}
