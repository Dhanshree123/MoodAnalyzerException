package MoodAnalyzer;

public class MoodAnalyzer {
	
	private String msg;
	
	public MoodAnalyzer(String msg) {
		this.msg =msg;
	}
	
	public String analyzeMood(String msg) throws MoodAnalysisException {
		this.msg = msg;
		return analyzeMood();
	}
	
	public String analyzeMood() throws MoodAnalysisException {
		try {
			if(msg.length() == 0)
				throw new MoodAnalysisException(MoodAnalysisException.InputExceptionType.INPUT_EMPTY,"Please enter proper message");
			if(msg.contains("sad"))
				return "SAD";
			else
				return "HAPPY";
		}
		catch (NullPointerException e) {
			throw new MoodAnalysisException(MoodAnalysisException.InputExceptionType.INPUT_NULL,"Please enter proper message");
		}
	}

}
