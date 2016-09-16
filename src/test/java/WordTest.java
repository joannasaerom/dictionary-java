import org.junit.*;
import static org.junit.Assert.*;

public class WordTest {

  @Test
  public void word_instantiatesCorrectly_true() {
    Word aWord = new Word("Bubble");
    assertEquals(true, aWord instanceof Word);
  }

  @Test
  public void getWord_grabsWordFromObject_bubble() {
    Word aWord = new Word("Bubble");
    assertEquals("Bubble", aWord.getWord());
  }

  @Test
  public void all_returnsAllInstancesOfWord_true() {
    Word firstWord = new Word("Bubble");
    Word secondWord = new Word("Gum");
    assertEquals(true, Word.all().contains(firstWord));
    assertEquals(true, Word.all().contains(secondWord));
  }
}
