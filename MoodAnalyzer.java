package MoodAnalyzer;

public class MoodAnalyzer {
private String msg;
	
	public MoodAnalyzer(String msg) {
		this.msg =msg;
	}
	
	public String analyzeMood(String msg) {
		this.msg = msg;
		return analyzeMood();
	}
	
	public String analyzeMood() {
		
			if(msg.toLowerCase().contains("sad"))
				return "SAD";
			else
				return "HAPPY";
		
	}

}
