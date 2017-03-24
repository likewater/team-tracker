import org.junit.*;
import static org.junit.Assert.*;

public class TeamsTest {

  @Test
  public void category_instantiatesCorrectly_true() {
    Teams myTeams = new Teams("TeamName");
    assertEquals(true, myTeams instanceof Teams);
  }

  @Test
  public void Teams_instantiatesWithTeamName_String() {
    Teams myTeams = new Teams("TeamName");
    assertEquals("TeamName", myTeams.getTeamName());
  }
}
