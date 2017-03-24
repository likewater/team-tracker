import org.junit.*;
import static org.junit.Assert.*;

public class TeamsTest {

  @Test
  public void category_instantiatesCorrectly_true() {
    Teams myTeams = new Teams("TeamName");
    assertEquals(true, testCategory instanceof Teams);
  }
}
