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

  @Test
  public void Team_returnsAllInstancesOfTeam_true() {
    Team firstTeam = new Team("Team-one", "Focus", "Members");
    Team secondTeam = new Team("Name-two", "Focus", "Members");
    assertEquals(true, Team.all().contains(firstTeam));
    assertEquals(true, Team.all().contains(secondTeam));
  }
}
