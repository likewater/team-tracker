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
    //new code block
    for (Object individualAttendee: members.get(3))
      //for (Object eachString: individualAttendee)
        if (individualAttendee != this.mTeamName) {
          Team newTeam = new Team(this.mTeamName, this);
        } //else {
        //   Team.add(this);
        // }




    //new code block end
    //Team newTeam = new Team(this.mTeamName, this);
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
