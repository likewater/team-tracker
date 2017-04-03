import java.util.ArrayList;
import java.time.LocalDateTime;

public class Team {
  private String mTeamName;
  private Object mMember;
  private static ArrayList<Team> team = new ArrayList<Team>();

  public Team(String teamName) {
    mTeamName = teamName;
    //mMember = member;
    team.add(this);
  }

  public String getTeamName() {
    return mTeamName;
  }

  public Object getMembers() {
    return mMember;
  }

  public static ArrayList<Team> all() {
    return team;
  }

  public static void clear() {
    team.clear();
  }

}
