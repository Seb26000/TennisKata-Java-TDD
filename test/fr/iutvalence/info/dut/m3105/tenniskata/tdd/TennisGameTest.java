package fr.iutvalence.info.dut.m3105.tenniskata.tdd;


import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class TennisGameTest
{
	@Test
	public void CreationOfANewTennisGameWithLoveAll()
	{
		TennisGame tennisGame = new TennisGame();
		assertEquals("Love-all", tennisGame.getScore());
	}
	@Test
	public void CreationOfANewTennisGameAndTheServerScoreExpectedFifteenLove()
	{
		TennisGame tennisGame = new TennisGame();
		tennisGame.serverHasScored();
		assertEquals("Fifteen-love", tennisGame.getScore());
	}
	@Test
	public void CreationOfANewTennisGameAndTheServerScoreExpectedLoveFifteen()
	{
		TennisGame tennisGame = new TennisGame();
		tennisGame.receiverHasScored();
		assertEquals("Love-fifteen", tennisGame.getScore());
	}
	@Test
	public void CreationOfANewTennisGameAndAllThePlayersScoreExpectedFifteenAll()
	{
		TennisGame tennisGame = new TennisGame();
		tennisGame.serverHasScored();
		tennisGame.receiverHasScored();
		assertEquals("Fifteen-all", tennisGame.getScore());
	}
}
