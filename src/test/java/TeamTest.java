import org.junit.*;
import static org.junit.Assert.*;

public class TeamTest {

  @Test
  public void category_instantiatesCorrectly_true() {
    Team testCategory = new Team("Name", "Focus", "Members");
    assertEquals(false, testCategory instanceof Team);
  }
}
