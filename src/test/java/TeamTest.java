import org.junit.*;
import static org.junit.Assert.*;

public class TeamTest {

  @Test
  public void category_instantiatesCorrectly_true() {
    Team testCategory = new Team("TeamName", "Focus", "Members");
    assertEquals(true, testCategory instanceof Team);
  }

  @Test
  public void Team_instantiatesWithTeamName_String() {
    Team myTeam = new Team("TeamName", "Focus", "Members");
    assertEquals("TeamName", myTeam.getTeamName());
  }

  @Test
  public void Team_instantiatesWithFocus_String() {
    Team myTeam = new Team("TeamName", "Focus", "Members");
    assertEquals("Focus", myTeam.getFocus());
  }

  @Test
  public void Team_instantiatesWithMembers_String() {
    Team myTeam = new Team("TeamName", "Focus", "Members");
    assertEquals("Members", myTeam.getMembers());
  }
}
