// Bryan Guerre
// September 1st 2014
// Generates as many 6 number quick pick lottery  tickets randomly as the user wants
// Inputs: How many tickets the user wants
// Output: All tickets generated and sorted

import java.util.Collections;
import java.util.Random;
import java.util.ArrayList;

public class Ticket
{
	Random rand = new Random();
	ArrayList<Integer> numbersList = new ArrayList<Integer>();

	public Ticket()//constructor to create a generic 6 pick ticket
	{
		numbersList.add(rand.nextInt(49) + 1);// add one entry to start
		for (int i = 0; i < 5; i++)// loop for the rest of the 5 elements
		{
			int numToAdd = rand.nextInt(49) + 1;// generate the random number
			if (numbersList.contains(numToAdd))
				i--;
			else
				numbersList.add(numToAdd);
		}
	}

	public void sortAndPrintTicket()
	{
		Collections.sort(this.numbersList); // thank you collections library :)
		for (int i = 0; i < this.numbersList.size(); i++)
		{
			if (numbersList.get(i) < 10)//adds a nicer formatting everything is 2 digits
				System.out.print("0" + numbersList.get(i) + " ");
			else
				System.out.print(numbersList.get(i) + " ");
		}
		System.out.println("");
		
	}
}
