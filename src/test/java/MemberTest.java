import org.junit.*;
import static org.junit.Assert.*;

public class MemberTest {

  @Test
  public void category_instantiatesCorrectly_true() {
    Category testCategory = new Category("Name", "Languages", "Interests");
    assertEquals(false, testCategory instanceof Category);
  }
