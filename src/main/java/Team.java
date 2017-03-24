import java.util.ArrayList;
import java.time.LocalDateTime;

public class Team {
  private String mTeamName;
  private Object mMembers;
  private static ArrayList<Team> team = new ArrayList<Team>();

  public Team(String teamName, Object member) {
    mTeamName = teamName;
    mMembers = member;
    team.add(this);
  }

  public String getTeamName() {
    return mTeamName;
  }

  public Object getMembers() {
    return mMembers;
  }

  public static ArrayList<Team> all() {
    return team;
  }

  public static void clear() {
    team.clear();
  }

}
