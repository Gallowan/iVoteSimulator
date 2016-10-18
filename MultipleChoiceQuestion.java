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
 * ~MultipleChoiceQuestion Class~
 * Implements Question interface to gather multiple choice answers.
 */

public class MultipleChoiceQuestion implements Question {

	
	private String question;
	private ArrayList<String> answerChoice;
	
	public MultipleChoiceQuestion(String question, ArrayList<String> answerChoice)
	{
		this.question = question;
		this.answerChoice = answerChoice;
	}
	
	public boolean single() {
		return false;
	}
	
	public String getQuestion() {
		return this.question;
	}

	public ArrayList<String> getAnswers() {
		return this.answerChoice;
	}	
}