import java.util.ArrayList;
import java.time.LocalDateTime;

public class Member {
  private String mName;
  private String mLanguages;
  private String mInterests;
  //private boolean mCompleted;
  //private LocalDateTime mCreatedAt;
  //private static ArrayList<Task> instances = new ArrayList<Task>();
  //private int mId;

  public Member(String name, String languages, String interests) {
    mName = name;
    mLanguages = languages;
    mInterests = interests;
    //mCompleted = false;
    //mCreatedAt = LocalDateTime.now();
    //instances.add(this);
    //mId = instances.size();
  }

  public String getName() {
    return mName;
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
