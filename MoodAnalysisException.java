package MoodAnalyzer;

@SuppressWarnings("serial")
public class MoodAnalysisException extends Exception{
	
	enum InputExceptionType{
		INPUT_NULL,INPUT_EMPTY
	}
	
	InputExceptionType inputType;
	
	public MoodAnalysisException(InputExceptionType inputType, String msg) {
		super(msg);
		this.inputType = inputType ;
	}

}
