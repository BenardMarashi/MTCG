package test.java;

import battle.BattleManager;
import cards.Card;
import cards.CardDeck;
import enums.CardType;
import enums.ElementType;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
public class BattleTest {
    CardDeck deckA=new CardDeck();
    CardDeck deckB=new CardDeck();

    @Test
    void testBattleWin(){
        fillDecksWithCards();
        deckA.initializeCards();
        deckB.initializeCards();

        BattleManager.BattleResult result=BattleManager.battle(deckA,deckB);

        System.out.println(result.getBattleLog());
        assertThat(result.getResult()).isEqualTo(1);
    }

    @Test
    void testBattleDraw(){
        fillDecksWithCards();
        deckA.initializeCards();
        deckB.initializeCards();

        BattleManager.BattleResult result=BattleManager.battle(deckA,deckA);

        System.out.println(result.getBattleLog());
        assertThat(result.getResult()).isEqualTo(0);
    }

    @Test
    void testBattleLose(){
        fillDecksWithCards();
        deckA.initializeCards();
        deckB.initializeCards();

        BattleManager.BattleResult result=BattleManager.battle(deckB,deckA);

        System.out.println(result.getBattleLog());
        assertThat(result.getResult()).isEqualTo(-1);
    }

    private void fillDecksWithCards(){
        Card[] myCards={new Card("WaterSpell",20, CardType.SPELL, ElementType.WATER,"2")
                ,new Card("FireSpell",32, CardType.SPELL, ElementType.FIRE,"3")
                ,new Card("Dragon",50, CardType.SPELL, ElementType.NORMAL,"4")
                ,new Card("WaterOrk",25, CardType.SPELL, ElementType.WATER,"5")};


        Card[] oppsCards={new Card("WaterSpell",1, CardType.SPELL, ElementType.WATER,"8")
                ,new Card("WaterSpell",1, CardType.SPELL, ElementType.WATER,"7")
                ,new Card("Dragon",1, CardType.SPELL, ElementType.NORMAL,"6")
                ,new Card("Kraken",1, CardType.SPELL, ElementType.WATER,"9")};


        for(Card c:myCards){deckA.addCardToDeck(c);}
        for(Card c:oppsCards){deckB.addCardToDeck(c);}


    }

}

