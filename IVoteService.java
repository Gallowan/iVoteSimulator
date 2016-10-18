import java.util.Map;
import java.util.TreeMap;

/**
 * CS 356.01: Object-Oriented Programming
 * Professor: Yu Sun
 * 
 * Programming Assignment #1
 * <iVote Simulator>
 * 
 * Justin Galloway
 * 
 * ~IVoteService Class~
 * Gathers answer submissions from Student class and makes
 * a list of results.
 * PrintCounter will check for duplicate answer submissions
 * and update accordingly.
 * Used TreeMap because it's familiar. Although to be completely honest
 * I'm not entirely sure why this works 100%. It prints nicely though.
 */

public class IVoteService {

	private Map<String, Integer> table = new TreeMap<String, Integer>();
	
	public void printCounter() 
	{
		//traverses collected
		for (String id : Student.returnCollected().keySet())
		{
			for (int i = 0; i < Student.returnCollected().get(id).size(); ++i)
			{
				if (!(table.containsKey(Student.returnCollected().get(id).get(i))))
				{
					table.put(Student.returnCollected().get(id).get(i), 1);
				}
				else
				{
					table.put(Student.returnCollected().get(id).get(i), table.get(Student.returnCollected().get(id).get(i)) + 1);
				}
			}
		}
		
		System.out.println(table);
	}
}