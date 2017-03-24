import java.util.ArrayList;
import java.time.LocalDateTime;

public class Member {
  private String mName;
  private String mLanguages;
  private String mInterests;
  private String mTeamName;
  //private boolean mCompleted;
  //private LocalDateTime mCreatedAt;
  private static ArrayList<Member> members = new ArrayList<Member>();
  //private int mId;

  public Member(String name, String languages, String interests, String teamName) {
    mName = name;
    mLanguages = languages;
    mInterests = interests;
    mTeamName = teamName;
    //mCompleted = false;
    //mCreatedAt = LocalDateTime.now();
    members.add(this);
    //mId = instances.size();
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
  //
  // public boolean isCompleted() {
  //   return mCompleted;
  // }
  //
  // public LocalDateTime getCreatedAt() {
  //   return mCreatedAt;
  // }
  //
  public static ArrayList<Member> all() {
    return members;
  }

  public static void clear() {
    members.clear();
  }
  //
  // public int getId() {
  //   return mId;
  // }
  //
  // public static Task find(int id) {
  // return instances.get(id - 1);
  // }

}
