package fr.iutvalence.info.dut.m3105.tenniskata.tdd;
public class TennisGame
{

	private String score;
	
	public TennisGame(){
		score = "Love-all";
	}
	
	public String getScore() 
	{
		return score;
	}

	public void serverHasScored() 
	{
		score = "Fifteen-love";
	}

}
