import java.util.ArrayList;
import java.util.List;

public class Member {
  private String mName;
  private static ArrayList<Member> members = new ArrayList<Member>();

  public Member(String name) {
    mName = name;
    members.add(this);
  }

  public String getName() {
    return mName;
  }

  public static ArrayList<Member> all() {
    return members;
  }

  public static void clear() {
    members.clear();
  }

}
