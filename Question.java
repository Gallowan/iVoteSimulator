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
 * ~Question Class~
 * Interface for implementing questions. Retrieves a String or an
 * ArrayList for the Getters. "single" method will check if the question
 * is single or multiple choice and returns accordingly.
 */

public interface Question {

	public String getQuestion();
	public ArrayList<String> getAnswers();
	
	public boolean single();
	
	
}