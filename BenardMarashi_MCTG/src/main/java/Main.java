package main.java;

import server.ServerMain;

public class Main {
    public static void main(String[] args) {
   /*   Deck d1=createDeck1();
    Deck d2=createDeck2();
     System.out.println(d1);
        System.out.println(d2);
        System.out.println(new Battlefield(d1,d2).battle()); */


       ServerMain s = new ServerMain();
        s.startServer();


    }
}
/*      static Deck createDeck1(){
        User u1 = new User();
        Card c1=new MonsterCard("123","Kraken1",20f, ElementType.WATER, MonsterType.ORK);
        Card c2= new MonsterCard("128","Kraken2",56f, ElementType.NORMAL, MonsterType.WIZZARD);
        Card c4= new SpellCard("WaterSpell",60f, ElementType.FIRE,"124");
        Card c3= new SpellCard("WaterSpell",60f, ElementType.FIRE,"127");
        List<Card>  c = new ArrayList<>();
        c.add(c1);
        c.add(c2);
        c.add(c3);
        c.add(c4);
        Deck deck=new Deck();
        deck.configureDeck(c);
        //  deck.addCardToDeck(c1);
        //deck.addCardToDeck(c4);
       // System.out.println(deck.toString());
        return deck;
    }
  static Deck createDeck2(){
        User u1 = new User();
        Card c1=new MonsterCard("123","Kraken1",1f, ElementType.WATER, MonsterType.ORK);
        Card c2= new MonsterCard("128","Kraken2",1f, ElementType.NORMAL, MonsterType.WIZZARD);
        Card c4= new SpellCard("FireSpell",8f, ElementType.FIRE,"124");
        Card c3= new SpellCard("WaterSpell",2f, ElementType.FIRE,"127");
        List<Card>  c = new ArrayList<>();
        c.add(c1);
        c.add(c2);
        c.add(c3);
        c.add(c4);
        Deck deck=new Deck();
        deck.configureDeck(c);
        //  deck.addCardToDeck(c1);
        //deck.addCardToDeck(c4);
        // System.out.println(deck.toString());
        return deck;
    }
}
*/