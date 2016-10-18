import java.util.ArrayList;
import java.util.Random;

/**
 * CS 356.01: Object-Oriented Programming
 * Professor: Yu Sun
 * 
 * Programming Assignment #1
 * <iVote Simulator>
 * 
 * Justin Galloway
 * 
 * ~SimulationDriver Class~
 * The SimulationDriver class runs the main program to start the
 * iVote simulator application.
 * This creates a multiple choice or true/false question (preset
 * because it's more fun that way).
 */

public class SimulationDriver {
	
	public static void main(String[] args)
	{	
		//Multiple Choice Question
		String question = "How much wood would a woodchuck chuck if a woodchuck could chuck wood?";
		ArrayList<String> answerList = new ArrayList<String>();
		answerList.add("A. 4");
		answerList.add("B. 27");
		answerList.add("C. 34");
		answerList.add("D. 65");
		answerList.add("E. 176");
		Question multipleQuestion = new MultipleChoiceQuestion(question, answerList);
		
		//Single Choice Question
		String question2 = "Are you enjoying this class?";
		ArrayList<String> answerList2 = new ArrayList<String>();
		answerList2.add("Definitely!");
		answerList2.add("Not really...");
		Question singleQuestion = new SingleChoiceQuestion(question2, answerList2);
		
		Question type[] = new Question[2];
		Question questionChoice;
		type[0] = multipleQuestion; 
		type[1] = singleQuestion;
		questionChoice = type[(int)(new Random().nextInt(2))];
		System.out.println("Question = " + questionChoice.getQuestion());
		
		//Initialization for IVoteService method
		IVoteService iVote = new IVoteService();
		
		//Generate list of students and their answers
		int randomSize = (int)(new Random().nextInt(60) + 1);
		Student student[] = new Student[randomSize];
		System.out.println("Answer sample size is " + randomSize);
		
		//Send answers to IVoteService for results
		int randomStudents = (int)(new Random().nextInt(randomSize));
		int randomNumber;
		
		System.out.println("\nResults: ");
		
		for (int i = 0; i < student.length; ++i)
		{
			student[i] = new Student("#" + i);
		}
			
		for (int i = 0; i < randomStudents; ++i)
		{
			randomNumber = (int)(new Random().nextInt(randomStudents));
			student[randomNumber].submitAnswer(questionChoice);
			System.out.println("Student " + student[randomNumber].getId() + "  -  Answer: " + student[randomNumber].getAnswer());
		}
		
		//Print results
		iVote.printCounter();
		
	}
}