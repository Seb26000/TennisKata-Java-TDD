package fr.iutvalence.info.dut.m3105.tenniskata.tdd;
public class TennisGame
{

	private String writtenScore; 
	private int serverNumberOfScoredPoints;
	private int receiverNumberOfScoredPoints;
	
	public TennisGame(){
		this.writtenScore = "Love-all";
		this.serverNumberOfScoredPoints = 0;
		this.receiverNumberOfScoredPoints = 0;
	}
	
	public String getScore() 
	{
		this.updateWrittenScore();
		return writtenScore;
	}

	public void serverHasScored() 
	{ 
		serverNumberOfScoredPoints++;
	}

	public void receiverHasScored() {
		receiverNumberOfScoredPoints++;
	}
	
	public void updateWrittenScore()
	{

	}

}
