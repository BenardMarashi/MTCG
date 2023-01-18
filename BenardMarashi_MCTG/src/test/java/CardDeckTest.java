package test.java;

import cards.Card;
import cards.CardDeck;
import enums.CardType;
import enums.ElementType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CardDeckTest {

    private CardDeck classUnderTest=new CardDeck();


    @Test
    void testDeck(){

        Card c = classUnderTest.getRandomCardFromDeck();
        assertThat(c.getName().contains("Fire")).isTrue();
    }


@BeforeEach
    private void fillDecksWithCards(){
        Card[] myCards={new Card("FireSpell",20, CardType.SPELL, ElementType.FIRE,"2")
                ,new Card("FireSpell",32, CardType.SPELL, ElementType.FIRE,"3")
                ,new Card("FireDragon",50, CardType.SPELL, ElementType.FIRE,"4")
                ,new Card("FireOrk",25, CardType.SPELL, ElementType.FIRE,"5")};

        for(Card c:myCards){classUnderTest.addCardToDeck(c);}



    }
}
