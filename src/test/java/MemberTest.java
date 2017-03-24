import org.junit.*;
import static org.junit.Assert.*;

public class MemberTest {

  @Test
  public void category_instantiatesCorrectly_true() {
    Member testCategory = new Member("Name", "Languages", "Interests");
    assertEquals(true, testCategory instanceof Member);
  }
}
