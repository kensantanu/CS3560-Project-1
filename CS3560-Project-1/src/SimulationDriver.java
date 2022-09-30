import java.io.*;
import java.util.*;

public class SimulationDriver {

	public static void main(String[] args) throws IOException {
		
		// comment out for manual input
		System.setIn(new FileInputStream("CaseInput"));
		
		// local variables
		final int numOfStudent = 50;	
		Random random = new Random();
		
		System.out.println("=== Please comment out line 9 for manual input ===");
		System.out.println("=== This is an automatic run base on CaseInput file in project folder ===\n");
		
		// instantiate new voting service
		VotingService iVote = new VotingService();
		
		// Create new question
		System.out.println("//Create new question\n");
		iVote.createNewQuestion();
		
		System.out.println();
		
		// Generate 50 students
		System.out.println("// Generate 50 students\n");
		for(int i = 0; i < numOfStudent; i++)
		{
			iVote.addStudent(new Student(String.valueOf(i)));
		}
		
		System.out.println();
		
		// Submit random answers
		System.out.println("// Each student submit 1 to 3 random answers\n");		
		for(int i = 0; i < numOfStudent; i++)
		{
			iVote.submitAnswer(iVote.getStudentList().get(i), random.nextInt(5));
		}
		
		for(int i = 0; i < numOfStudent; i++)
		{
			iVote.submitAnswer(iVote.getStudentList().get(i), random.nextInt(5));
		}
		
		for(int i = 0; i < numOfStudent; i++)
		{
			iVote.submitAnswer(iVote.getStudentList().get(i), random.nextInt(5));
		}
		
		System.out.println();
		
		// Show result
		System.out.println("//Show result\n");
		iVote.showResult();
		
		System.out.println();

	}

}
