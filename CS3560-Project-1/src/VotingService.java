import java.util.*;

public class VotingService {
	
	// attributes
	private ArrayList<Student> studentList = new ArrayList<>();
	private ArrayList<String> answerList = new ArrayList<>();
	private ArrayList<Integer> answer = new ArrayList<>();
	private Question question;
	private String prompt;
	private int count;
	private int menu;
	private String str;
	
	// constructor
	public VotingService()
	{
		
	}
	
	// behaviors
	public void createNewQuestion()
	{		
		Scanner in =  new Scanner(System.in);
		
		System.out.print("Enter prompt for the poll: ");
		
		prompt = in.nextLine();	
		
		System.out.println("Configure answers (type # when finished): ");
		
		while(true)
		{
			str = in.nextLine();
			
			if (str.equals("#"))
			{
				break;	
			}
			
			answerList.add(str);
		}
		
		System.out.print("Single or multiple answer?\n"
				+ "1. Single answer\n"
				+ "2. Multiple answer\n"
				+ "******************************\n"
				+ "Enter selection: ");
		menu = in.nextInt();
		System.out.println("");
		
		//Switch statements for menu
		switch (menu)
		{
			case 1://Single answer
			{
				question = new QuestionSingle(prompt, answerList);
				break;	
			
			}//end case 1
			
			case 2://Multiple answer
			{
				question = new QuestionMultiple(prompt, answerList);			
				break;	
			
			}//end case 2
			
			
			case 3://Exit sequence
			{
				System.out.println("Canceled");	
				break;
			}
			
			default:
				System.out.println("--------------------");
				System.out.println("INVALID INPUT");
				System.out.println("--------------------");
				System.out.println("");
			
		}//end of switch statements		
		
		in.close();
	}
	
	private void calculateResult()
	{
		for(int i = 0; i < 10; i++)
		{
			answer.add(0);
		}
		
		for (ArrayList<Boolean> i : question.getStudentAnswer().values())
		{
			
			for(int j = 0; j < i.size(); j++)
			{				
				if (i.get(j) == true)
				{ 
					answer.set(j, answer.get(j) + 1);
					count++;
				}
				 
			}
			
        }
	}
	
	public void showResult()
	{
		calculateResult();
		
		System.out.println("Prompt:");
		System.out.println(question.getPrompt());
		
		System.out.println("Result:");
		
		for(int i = 0; i < answerList.size(); i++)
		{
            System.out.println(answerList.get(i) + ": " + answer.get(i));
        }
		
		System.out.println("Total vote: " + count);
	}
	
	public void addStudent(Student s)
	{
		studentList.add(s);
	}
	
	public void submitAnswer(Student s, int a)
	{
		question.submitAnswer(s, a);
	}
	
	public ArrayList<Student> getStudentList() {
		return studentList;
	}
}
