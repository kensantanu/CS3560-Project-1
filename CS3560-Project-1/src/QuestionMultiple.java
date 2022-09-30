
import java.util.*;

public class QuestionMultiple implements Question
{
	// attributes
	private String prompt;
	private ArrayList<String> answerList = new ArrayList<>();
	private HashMap<String, ArrayList<Boolean>> studentAnswer = new HashMap<>();
	ArrayList<Boolean> answer = new ArrayList<>();	

	public QuestionMultiple(String p, ArrayList<String> l) 
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
		if (studentAnswer.get(s.getStudentID()) == null)
		{
			answer = new ArrayList<>();
			
			for(int i = 0; i < 10; i++)
			{
				answer.add(false);
			}	
			
		}
		else
		{
			answer = studentAnswer.get(s.getStudentID());
		}
		
		answer.set(a, true);		
		
		studentAnswer.put(s.getStudentID(), answer);
	}
	
	public HashMap<String, ArrayList<Boolean>> getStudentAnswer() {
		return studentAnswer;
	}

}