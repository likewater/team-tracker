import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;

public class Team {
  private String mTeamName;
  private static ArrayList<Team> team = new ArrayList<Team>();
  private int mId;
  private List<Member> mMembers;

  public Team(String teamName) {
    mTeamName = teamName;
    mId = team.size();
    mMembers = new ArrayList<Member>();
    team.add(this);
  }

  public String getTeamName() {
    return mTeamName;
  }

  public static ArrayList<Team> all() {
    return team;
  }

  public static void clear() {
    team.clear();
  }

  public int getId() {
    return mId;
  }

  public static Team find(int id) {
   return team.get(id - 1);
 }

  public List<Member> getMembers() {
    return mMembers;
  }

  public void addMember(Member member) {
    mMembers.add(member);
  }


}
