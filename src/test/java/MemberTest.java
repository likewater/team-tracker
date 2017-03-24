import org.junit.*;
import static org.junit.Assert.*;

public class MemberTest {

  @Test
  public void Member_instantiatesCorrectly_true() {
    Member myMember = new Member("Name", "Languages", "Interests", "TeamName");
    assertEquals(true, myMember instanceof Member);
  }

  @Test
  public void Member_instantiatesWithName_String() {
    Member myMember = new Member("Name", "Languages", "Interests", "TeamName");
    assertEquals("Name", myMember.getName());
  }

  @Test
  public void Member_instantiatesWithLanguages_String() {
    Member myMember = new Member("Name", "Languages", "Interests", "TeamName");
    assertEquals("Languages", myMember.getLanguages());
  }

  @Test
  public void Member_instantiatesWithInterests_String() {
    Member myMember = new Member("Name", "Languages", "Interests", "TeamName");
    assertEquals("Interests", myMember.getInterests());
  }

  @Test
  public void Member_instantiatesWithTeamName_String() {
    Member myMember = new Member("Name", "Languages", "Interests", "TeamName");
    assertEquals("TeamName", myMember.getTeamName());
  }

  @Test
  public void Member_returnsAllInstancesOfMember_true() {
    Member firstMember = new Member("Name-one", "Languages", "Interests", "TeamName");
    Member secondMember = new Member("Name-two", "Languages", "Interests", "TeamName");
    assertEquals(true, Member.all().contains(firstMember));
    assertEquals(true, Member.all().contains(secondMember));
  }



}
