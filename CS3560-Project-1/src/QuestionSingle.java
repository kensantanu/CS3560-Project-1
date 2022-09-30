import java.util.*;

public class QuestionSingle implements Question
{
	// attributes
	private String prompt;
	private ArrayList<String> answerList = new ArrayList<>();
	private HashMap<String, ArrayList<Boolean>> studentAnswer = new HashMap<>();

	public QuestionSingle(String p, ArrayList<String> l) 
	{
		prompt = p;
		answerList = l;
	}
	
	// behaviors
	public String getPrompt() {
		return prompt;
	}

	public void setPrompt(String prompt) {
		this.prompt = prompt;
	}
	
	public void submitAnswer(Student s, int a)
	{		
		ArrayList<Boolean> answer = new ArrayList<>();
		
		for(int i = 0; i < 10; i++)
		{
			answer.add(false);
		}		
		
		answer.set(a, true);		
		
		studentAnswer.put(s.getStudentID(), answer);
	}
	
	public HashMap<String, ArrayList<Boolean>> getStudentAnswer() {
		return studentAnswer;
	}

}
