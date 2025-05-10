//don't forget to import anything else you need (ArrayLists, HashMaps, Scanners, etc)
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import java.beans.Transient;
import java.io.*;

public class ProblemSetTest {

   //Create your tests here if you want any

   /*

   //Example Test
   
   @Test
   public void exampleTest()
   {
      Cat cat = new Cat();
      assertEquals("whiskers", cat.getName());
   }
   */


   @Test
   public void CardTest1()
   {
      Card card = new Card("Ace", "Clubs", 3);
      assertEquals("Ace", card.getName());
   }

   @Test
   public void CardTest2()
   {
      Card card = new Card("Ace", "Clubs", 3);
      assertEquals("Clubs", card.getSuit());
   }

   @Test
   public void CardTest3()
   {
      Card card = new Card("Ace", "Clubs", 3);
      assertEquals(3, card.getValue());
   }
   @Test
   public void DeckTest1() 
   {
      Deck deck = new Deck();
      assertEquals(52, deck.size()); 
   }

   @Test
   public void DeckTest2() 
   {
      Deck deck = new Deck();
      assertEquals(52, deck.size()); 
   }


   @Test
   public void DiscardTest1() 
   {
      DiscardPile discard = new DiscardPile();
      assertEquals(0, discard.size());
   }

   @Test 
   public void PlayerTest1() 
   {
      Player player = new Player("Ilakkiyan", 18);
      assertEquals("Ilakkiyan", player.getName());
   }

   @Test
   public void PlayerTest2()
   {
      Player player = new Player("Ilakkiyan", 18);
      assertEquals(18, player.getAge());
   }

  





}
