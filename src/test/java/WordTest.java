import org.junit.*;
import static org.junit.Assert.*;

public class WordTest {
  @After
  public void clearIt() {
    Word.clear();
  }

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

  @Test
  public void getId_wordInstantiatesWithAnId_1() {
    Word aWord = new Word("Bubble");
    assertEquals(1, aWord.getId());
  }

  @Test
  public void find_returnsWordWithSameId_secondWord() {
    Word firstWord = new Word("Bubble");
    Word secondWord = new Word("Gum");
    assertEquals(secondWord, Word.find(secondWord.getId()));
  }

  @Test
  public void addDefinition_addsDefinitionToWord_true() {
    Word firstWord = new Word("Bubble");
    Definition firstDefinition = new Definition("Fun stuff");
    firstWord.addDefinition(firstDefinition);
    assertEquals(true, firstWord.getDefinitions().contains(firstDefinition));
  }

  @Test
  public void getDefinitions_returnsDefinitions_true() {
    Word firstWord = new Word("Bubble");
    Definition firstDefinition = new Definition("Fun stuff");
    Definition secondDefinition = new Definition("Something");
    firstWord.addDefinition(firstDefinition);
    firstWord.addDefinition(secondDefinition);
    assertEquals(true, firstWord.getDefinitions().contains(firstDefinition));
    assertEquals(true, firstWord.getDefinitions().contains(secondDefinition));
  }
}
