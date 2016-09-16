import org.junit.*;
import static org.junit.Assert.*;

public class DefinitionTest {

  @Test
  public void Definition_instantiatesCorrectly_true() {
    Definition aDefinition = new Definition("Something beautiful");
    assertEquals(true, aDefinition instanceof Definition);
  }

  @Test
  public void Definition_getsDefinition_true() {
    Definition aDefinition = new Definition("Something beautiful");
    assertEquals("Something beautiful", aDefinition.getDefinition());
  }
}
