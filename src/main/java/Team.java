import java.util.ArrayList;
import java.time.LocalDateTime;

public class Team {
  private String mTeamName;
  private String mFocus;
  private String mMembers;
  //private boolean mCompleted;
  //private LocalDateTime mCreatedAt;
  //private static ArrayList<Task> instances = new ArrayList<Task>();
  //private int mId;

  public Team(String teamName, String focus, String members) {
    mTeamName = teamName;
    mFocus = focus;
    mMembers = members;
    //mCompleted = false;
    //mCreatedAt = LocalDateTime.now();
    //instances.add(this);
    //mId = instances.size();
  }

  public String getTeamName() {
    return mTeamName;
  }

  public String getFocus() {
    return mFocus;
  }

  public String getMembers() {
    return mMembers;
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
  // public static ArrayList<Task> all() {
  //   return instances;
  // }
  //
  // public static void clear() {
  //   instances.clear();
  // }
  //
  // public int getId() {
  //   return mId;
  // }
  //
  // public static Task find(int id) {
  // return instances.get(id - 1);
  // }

}
