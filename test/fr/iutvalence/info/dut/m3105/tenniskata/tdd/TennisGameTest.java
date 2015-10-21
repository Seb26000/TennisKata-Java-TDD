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
	public void CreationOfANewTennisGameWithFifteenLove()
	{
		TennisGame tennisGame = new TennisGame();
		tennisGame.serverHasScored();
		assertEquals("Fifteen-love", tennisGame.getScore());
	}
}
