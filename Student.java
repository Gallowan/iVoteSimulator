import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
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
 * ~Student Class~
 * Main identification class that generates a student and their ID, submits
 * answers and sends them to the IVoteService class to create results.
 * 'submitAnswer' will check what kind of question the question is and store
 * it in specific array lists accordingly.
 */

public class Student {

	private String studentID;
	private ArrayList<String> answer;
	private static HashMap<String, ArrayList<String>> collectAnswer = new HashMap<String, ArrayList<String>>();
	
	public Student(String id)
	{
		this.studentID = id;
	}
	public String getId()
	{
		return studentID;
	}
	
	public ArrayList<String> submitAnswer(Question question) 
	{
		//True for single choice, false for multiple
		if (question.single())
		{
			answer = new ArrayList<String>(question.getAnswers());
			Collections.shuffle(answer);
			answer.remove(0);
			collectAnswer.put(getId(), answer);
		}

		else if(!(question.single()))
		{
			answer = new ArrayList<String>(question.getAnswers());
			Collections.shuffle(answer);
			for (int i = answer.size() - 1; i > (int)(new Random().nextInt(answer.size()) + 1); i--)
			{
				answer.remove(i);
			}
			
			for (int i = 0; i < answer.size(); ++i)
			{
				if (answer.get(i) != null)
				{
					collectAnswer.put(getId(), answer);
				}
			}
		}
		Collections.sort(answer);
		return answer;
	}
	
	public ArrayList<String> getAnswer() {
		return answer;
	}
	public static HashMap<String, ArrayList<String>> returnCollected() 
	{
		return collectAnswer;
	}
}