package MoodAnalyzer;

public class MoodAnalyzer {
private String msg;
	
	public MoodAnalyzer(MoodAnalyzer obj) {
		this.msg =msg;
	}
	
	public String analyzeMood(String msg) {
		this.msg = msg;
		return analyzeMood();
	}
	
	public String analyzeMood() {
		try {
			if(msg.contains("sad"))
				return "SAD";
			else
				return "HAPPY";
		}
		catch (NullPointerException e) {
			return "HAPPY";
		}
	}

}
