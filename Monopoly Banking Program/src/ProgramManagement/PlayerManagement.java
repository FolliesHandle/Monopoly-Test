package ProgramManagement;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import org.w3c.dom.css.Counter;

public class PlayerManagement 
{
	private ArrayList<Player> playerList;
	private int taxes;
	
	public PlayerManagement(int newBalance)
	{
		taxes = 0;
		playerList = new ArrayList<Player>();
		int players = Integer.parseInt(JOptionPane.showInputDialog("How many players?"));
		for(int i = 0; i < players; i++)
		{
			playerList.add(new Player(JOptionPane.showInputDialog("What is player " + (i + 1) + "'s name?")));
		}
		for( Player i : playerList)
		{
			i.setBalance(newBalance);
		}
	}
	
	public void newGame(int newBalance)
	{
		taxes = 0;
		playerList.clear();
		int players = Integer.parseInt(JOptionPane.showInputDialog("How many players?"));
		for(int i = 0; i < players; i++)
		{
			playerList.add(new Player(JOptionPane.showInputDialog("What is player " + (i + 1) + "'s name?")));
		}
		for( Player i : playerList)
		{
			playerList.get(playerList.indexOf(i)).setBalance(newBalance);
		}
	}
	
	public void takeTaxAndPenalties(int balance, String playerName)
	{
		for(Player item : playerList)
		{
			if(item.getName().equals(playerName))
			{
				playerList.get(playerList.indexOf(item)).withdraw(balance);
				taxes += balance;
				break;
			}
			
		}
	}
	
	public void addTaxAndPenalties(String playerName)
	{
		for(Player item : playerList)
		{
			if(item.getName().equals(playerName))
			{
				playerList.get(playerList.indexOf(item)).deposit(taxes);
				taxes = 0;
				break;
			}
			
		}
	}
	
	public void payPlayer(int balance, String payingPlayer, String recievingPlayer)
	{
		int count = 0;
		for(Player item : playerList)
		{
			if(count >= 2) break;
			if(item.getName().equals(payingPlayer))
			{
				playerList.get(playerList.indexOf(item)).withdraw(balance);
				count++;
			}
		
			if(item.getName().equals(payingPlayer))
			{
				playerList.get(playerList.indexOf(item)).deposit(balance);
				count++;
			}
		}
	}
	
	public void giveMoney(int amt, String playerName)
	{
		for(Player item : playerList)
		{
			if(item.getName().equals(playerName))
			{
				playerList.get(playerList.indexOf(item)).deposit(amt);
				break;
			}
		}
	}
	
}
