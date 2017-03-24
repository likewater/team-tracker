import org.junit.*;
import static org.junit.Assert.*;

public class TeamTest {

  @Test
  public void category_instantiatesCorrectly_true() {
    Member myMember = new Member("Name", "Languages", "Interests", "TeamName");
    Team testCategory = new Team("TeamName", myMember);
    assertEquals(true, testCategory instanceof Team);
  }

  @Test
  public void Team_instantiatesWithTeamName_String() {
    Member myMember = new Member("Name", "Languages", "Interests", "TeamName");
    Team myTeam = new Team("TeamName", myMember);
    assertEquals("TeamName", myTeam.getTeamName());
  }

  @Test
  public void Team_instantiatesWithMembers_Object() {
    Member myMember = new Member("Name", "Languages", "Interests", "TeamName");
    Team myTeam = new Team("TeamName", myMember);
    assertEquals(myMember, myTeam.getMembers());
  }

  @Test
  public void Team_returnsAllInstancesOfTeam_true() {
    Member myMember = new Member("Name", "Languages", "Interests", "TeamName");
    Team firstTeam = new Team("TeamOne", myMember);
    Team secondTeam = new Team("TeamTwo", myMember);
    assertEquals(true, Team.all().contains(firstTeam));
    assertEquals(true, Team.all().contains(secondTeam));
  }
}
