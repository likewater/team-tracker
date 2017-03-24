import java.util.ArrayList;
import java.time.LocalDateTime;

public class Member {
  private String mName;
  private String mLanguages;
  private String mInterests;
  private String mTeamName;
  private static ArrayList<Member> members = new ArrayList<Member>();

  public Member(String name, String languages, String interests, String teamName) {
    mName = name;
    mLanguages = languages;
    mInterests = interests;
    mTeamName = teamName;
    members.add(this);
    Team newTeam = new Team(this.mTeamName, this);
  }

  public String getName() {
    return mName;
  }

  public String getLanguages() {
    return mLanguages;
  }

  public String getInterests() {
    return mInterests;
  }

  public String getTeamName() {
    return mTeamName;
  }

  public static ArrayList<Member> all() {
    return members;
  }

  public static void clear() {
    members.clear();
  }

}
