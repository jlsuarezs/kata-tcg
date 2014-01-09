package de.kimminich.kata.tcg;

import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;

import java.util.Collection;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class PlayerTest {

    Player player;

    @Before
    public void setUp() {
        player = new Player();
    }

    @Test
    public void playerShouldHave30InitialHealth() {
        assertThat(player.getHealth(), is(equalTo(30)));
    }

    @Test
    public void playerShouldHaveZeroInitialMana() {
        assertThat(player.getMana(), is(equalTo(0)));
    }

    @Test
    public void cardDeckShouldContainInitialCards() {
        assertThat(player.getNumberOfCardsWithManaCost(0), is(equalTo(2)));
        assertThat(player.getNumberOfCardsWithManaCost(1), is(equalTo(2)));
        assertThat(player.getNumberOfCardsWithManaCost(2), is(equalTo(3)));
        assertThat(player.getNumberOfCardsWithManaCost(3), is(equalTo(4)));
        assertThat(player.getNumberOfCardsWithManaCost(4), is(equalTo(3)));
        assertThat(player.getNumberOfCardsWithManaCost(5), is(equalTo(2)));
        assertThat(player.getNumberOfCardsWithManaCost(6), is(equalTo(2)));
        assertThat(player.getNumberOfCardsWithManaCost(7), is(equalTo(1)));
        assertThat(player.getNumberOfCardsWithManaCost(8), is(equalTo(1)));
    }

    @Test
    public void playerStartsWithEmptyHand() {
        assertThat(player.getNumberOfHandCards(), is(equalTo(0)));
    }

    @Test
    public void drawingACardShouldPutOneCardFromDeckIntoHand() {
        // given: A player with one card in deck and no cards in hand
        // when: The player draws a card
        // then: The deck has no cards and the hand has the one card from the deck
    }

}
