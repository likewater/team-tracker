import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("teams/:id/members/new", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      Team team = Team.find(Integer.parseInt(request.params(":id")));
      model.put("team", team);
      model.put("template", "templates/team-members-form.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/members", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("members", Member.all());
      model.put("template", "templates/members.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/members", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      Team team = Team.find(Integer.parseInt(request.queryParams("teamId")));
      String name = request.queryParams("name");//name/description
      Member newMember = new Member(name);
      team.addMember(newMember);
      model.put("team", team);
      model.put("template", "templates/team-member-success.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/members/:id", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      Member member = Member.find(Integer.parseInt(request.params(":id")));
      model.put("member", member);
      model.put("template", "templates/member.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/teams/new", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/team-form.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/teams", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      String name = request.queryParams("teamName");
      Team newTeam = new Team(name);
      model.put("template", "templates/team-success.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/teams", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("teams", Team.all());
      model.put("template", "templates/teams.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/teams/:id", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      Team team = Team.find(Integer.parseInt(request.params(":id")));
      model.put("team", team);
      model.put("template", "templates/team.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());


// public class App {
//   public static void main(String[] args) {
//     staticFileLocation("/public");
//     String layout = "templates/layout.vtl";
//
//     get("/", (request, response) -> {
//       Map<String, Object> model = new HashMap<String, Object>();
//       model.put("template", "templates/index.vtl");
//       return new ModelAndView(model, layout);
//     }, new VelocityTemplateEngine());
//
//     get("teams/new", (request, response) -> {
//       Map<String, Object> model = new HashMap<String, Object>();
//       model.put("template", "templates/team-form.vtl");
//       return new ModelAndView(model, layout);
//     }, new VelocityTemplateEngine());
//
//     get("teams", (request, response) -> {
//       Map<String, Object> model = new HashMap<String, Object>();
//       model.put("teams", request.session().attribute("teams"));
//       model.put("template", "templates/teams.vtl");
//       return new ModelAndView(model, layout);
//     }, new VelocityTemplateEngine());
//
//     get("teams/:id", (request, response) -> {
//       Map<String, Object> model = new HashMap<String, Object>();
//       model.put("template", "templates/team.vtl");
//       return new ModelAndView(model, layout);
//     }, new VelocityTemplateEngine());
//
//     post("/teams", (request, response) -> {
//       Map<String, Object> model = new HashMap<String, Object>();
//
//       ArrayList<Team> teams = request.session().attribute("teams");
//       if (teams == null) {
//         teams = new ArrayList<Team>();
//         request.session().attribute("teams", teams);
//       }
//       String teamName = request.queryParams("teamName");
//       Team newTeam = new Team(teamName);
//       teams.add(newTeam);
//       // request.session().attribute("team", newTeam);
//       // String teamName = request.queryParams("teamName");
//       // Member myMember = new Member("Name");
//       // Object Member = request.queryParams("member");
//       // Team newTeam = new Team(teamName, myMember);
//       model.put("template", "templates/team-success.vtl");
//       return new ModelAndView(model, layout);
//     }, new VelocityTemplateEngine());
//
//
// //members below
//
//
//
//     get("team/:team_id/members/new", (request, response) -> {
//       Map<String, Object> model = new HashMap<String, Object>();
//       model.put("members", request.session().attribute("members"));
//       model.put("template", "templates/team-members-form.vtl");
//       return new ModelAndView(model, layout);
//     }, new VelocityTemplateEngine());
//
//     get("teams/team_id/members/:members_id", (request, response) -> {
//       Map<String, Object> model = new HashMap<String, Object>();
//       //model.put("members", request.session().attribute("members"));
//       model.put("template", "templates/members.vtl");
//       return new ModelAndView(model, layout);
//     }, new VelocityTemplateEngine());
//
//     post("/members", (request, response) -> {
//         Map<String, Object> model = new HashMap<String, Object>();
//         ArrayList<Member> members = request.session().attribute("members");
//         if (members == null) {
//           members = new ArrayList<Member>();
//           request.session().attribute("members", members);
//         }
//         String name = request.queryParams("name");
//         Member newMember = new Member(name);
//         members.add(newMember);
//         // request.session().attribute("team", newTeam);
//         // String teamName = request.queryParams("teamName");
//         // Member myMember = new Member("Name");
//         // Object Member = request.queryParams("member");
//         // Team newTeam = new Team(teamName, myMember);
//         model.put("template", "templates/team-members-success.vtl");
//         return new ModelAndView(model, layout);
//       }, new VelocityTemplateEngine());
//     //   Map<String, Object> model = new HashMap<String, Object>();
//     //   String name = request.queryParams("name");
//     //   Member newMember = new Member(name);
//     //   model.put("template", "templates/team-members-success.vtl");
//     //   return new ModelAndView(model, layout);
//     // }, new VelocityTemplateEngine());
//
//
//
//
//     //end of file
  }
}
