import org.junit.*;
import static org.junit.Assert.*;

public class TeamTest {

  @Test
  public void TeamInstantiatesCorrectly_true() {
    Team testTeam = new Team("TeamName");
    assertEquals(true, testTeam instanceof Team);
  }

  @Test
  public void getTeamName_instantiatesWithTeamName_String() {
    Team myTeam = new Team("TeamName");
    assertEquals("TeamName", myTeam.getTeamName());
  }

  @Test
  public void all_returnsAllInstancesOfTeam_true() {
    Team firstTeam = new Team("TeamOne");
    Team secondTeam = new Team("TeamTwo");
    assertEquals(true, Team.all().contains(firstTeam));
    assertEquals(true, Team.all().contains(secondTeam));
  }

  @Test
 public void clear_emptiesAllCategoriesFromList_0() {
   Team testTeam = new Team("Bob's");
   Team.clear();
   assertEquals(Team.all().size(), 0);
 }

 @Test
 public void getId_categoriesInstantiateWithAnId_1() {
   Team testTeam = new Team("Lil's");
   assertEquals(1, testTeam.getId());
 }

 @Test
 public void find_returnsTeamWithSameId_secondTeam() {
   Team.clear();
   Team firstTeam = new Team("Lil's");
   Team secondTeam = new Team("Bob's");
   assertEquals(Team.find(secondTeam.getId()), secondTeam);
 }

  @Test
  public void getMembers_initiallyReturnsEmptyList_ArrayList() {
    Team.clear();
    Team testTeam = new Team("Home");
    assertEquals(0, testTeam.getMembers().size());
  }

  @Test
  public void addTask_addsTaskToList_true() {
    Team testTeam = new Team("Bob's");
    Member testMember = new Member("Bob");
    testTeam.addMember(testMember);
    assertTrue(testTeam.getMembers().contains(testMember));
  }




}
