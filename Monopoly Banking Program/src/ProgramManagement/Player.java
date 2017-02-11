package ProgramManagement;

import java.util.ArrayList;

//code in stuff to manage money
public class Player 
{
	private String playerName;
	private int balance;
	private ArrayList<Property> properties;
	
	public Player(int bal, String pName)
	{
		balance = bal;
		playerName = pName;
		properties = new ArrayList<Property>();
	}
	
	public Player(String pName)
	{
		playerName = pName;
	}
	
	public void changePlayerName(String newName)
	{
		playerName = newName;
	}
	
	public void deposit(int depAmt)
	{
		balance += depAmt;
	}
	
	public void withdraw(int wdrwAmt)
	{
		balance -= wdrwAmt;
	}
	
	public void setBalance(int balance)
	{
		this.balance = balance;
	}
	
	public int getBalance()
	{
		return balance;
	}
	
	public String getName()
	{
		return playerName;
	}

	public String toString()
	{
		return playerName;
	}
}
