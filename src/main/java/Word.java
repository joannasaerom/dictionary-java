import java.util.List;
import java.util.ArrayList;

public class Word {
  private String mWord;
  private static List<Word> instances = new ArrayList<Word>();

  public Word(String word) {
    mWord = word;
    instances.add(this);
  }

  public String getWord() {
    return mWord;
  }

  public static List<Word> all() {
    return instances;
  }
}
