import org.junit.*;
import static org.junit.Assert.*;

public class MemberTest {

  @Test
  public void MemberInstantiatesCorrectly_true() {
    Member myMember = new Member("Name");
    assertEquals(true, myMember instanceof Member);
  }

  @Test
  public void getName_instantiatesWithName_String() {
    Member myMember = new Member("Name");
    assertEquals("Name", myMember.getName());
  }

  @Test
  public void all_returnsAllInstancesOfMember_true() {
    Member firstMember = new Member("Name-one");
    Member secondMember = new Member("Name-two");
    assertTrue(Member.all().contains(firstMember));
    assertTrue(Member.all().contains(secondMember));
  }

  @Test
  public void getId_membersInstantiateWithAnID_1() {
    Member.clear();
    Member myMember = new Member("Bob");
    assertEquals(1, myMember.getId());
  }

  // @Test
  // public void find_returnsMemberWithSameId_secondMember() {
  //   Member firstMember = new Member("Bob");
  //   Member secondMember = new Member("Joy");
  //   assertEquals(Member.find(secondMember.getId()), secondMember);
  // }

  // @Test
  // public void all_returnsAllInstancesOfMember_true() {
  //   Member firstMember = new Member("Bob");
  //   Member secondMember = new Member("Jim");
  //   assertEquals(true, Member.all().contains(firstMember));
  //   assertEquals(true, Member.all().contains(secondMember));
  // }

  @Test
  public void clear_emptiesAllMembersFromArrayList_0() {
    Member myMember = new Member("Bob");
    Member.clear();
    assertEquals(Member.all().size(), 0);
  }

  @Test
  public void getId_MembersInstantiateWithAnID_1() {
    Member.clear();
    Member myMember = new Member("Jim");
    assertEquals(1, myMember.getId());
  }

  // @Test
  // public void find_returnsMemberWithSameId_secondMember() {
  //   Member firstMember = new Member("Bob");
  //   Member secondMember = new Member("Jim");
  //   assertEquals(Member.find(secondMember.getId()), secondMember);
  // }

}
