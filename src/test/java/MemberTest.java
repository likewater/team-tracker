import org.junit.*;
import static org.junit.Assert.*;

public class MemberTest {

  @Test
  public void category_instantiatesCorrectly_true() {
    Member myMember = new Member("Name", "Languages", "Interests");
    assertEquals(true, myMember instanceof Member);
  }

  @Test
  public void Task_instantiatesWithName_String() {
    Member myMember = new Member("Name", "Languages", "Interests");
    assertEquals("Name", myMember.getName());
  }

  @Test
  public void Task_instantiatesWithLanguages_String() {
    Member myMember = new Member("Name", "Languages", "Interests");
    assertEquals("Languages", myMember.getLanguages());
  }



}
