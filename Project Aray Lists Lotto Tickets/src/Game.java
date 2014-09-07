// Bryan Guerre
// September 1st 2014
// Generates as many 6 number quick pick lottery  tickets randomly as the user wants
// Inputs: How many tickets the user wants
// Output: All tickets generated and sorted

import java.util.ArrayList;
import java.util.Scanner;

public class Game
{
	ArrayList<Ticket> ticketList = new ArrayList<Ticket>();
	Scanner sc1 = new Scanner(System.in);

	public Game()
	{
		int numberOfTickets = startGame();
		for (int i = 0; i < numberOfTickets; i++)
			ticketList.add(getTicket());
		printAndSort();
	}

	public int startGame()// get the amount of tickets to generate
	{
		int numOfTickets = -1;
		System.out.println("Welcome to the quick pick lotto game! How many tickets would you like to buy?");
		while (numOfTickets < 0)
		{
			while (!sc1.hasNextInt())
			{
				System.out.println("That's not a valid number!");
				sc1.next();
			}
			numOfTickets = sc1.nextInt();
			if (numOfTickets < 0)
				System.out.println("Please enter a positive number smarty pants.");
		}
		return numOfTickets;
	}

	public Ticket getTicket()
	{
		Ticket t = new Ticket();
		return t;
	}

	public void printAndSort()
	{
		System.out.println("");
		for (int i = 0; i < ticketList.size(); i++)
			ticketList.get(i).sortAndPrintTicket();
		System.out.println("\nThanks for playing!");
	}
}
