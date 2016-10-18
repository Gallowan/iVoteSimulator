import java.util.ArrayList;

/**
 * CS 356.01: Object-Oriented Programming
 * Professor: Yu Sun
 * 
 * Programming Assignment #1
 * <iVote Simulator>
 * 
 * Justin Galloway
 * 
 * ~SingleChoiceQuestion Class~
 * Uses Question interface to generate single choice answers.
 */

public class SingleChoiceQuestion implements Question {

	private String question;
	private ArrayList<String> answerChoice;
	
	public SingleChoiceQuestion(String question, ArrayList<String> answerChoice)
	{
		this.question = question;
		this.answerChoice = answerChoice;
	}
	
	public boolean single() {
		return true;
	}
	
	public String getQuestion() {
		return this.question;
	}
	
	public ArrayList<String> getAnswers()
	{
		return this.answerChoice;
	}
}