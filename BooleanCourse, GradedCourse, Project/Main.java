public class Main {
    public static void main(String[] args) {
        BooleanCourse c1 = new BooleanCourse("Math", true);
        BooleanCourse c2 = new BooleanCourse("English", true);
        GradedCourse  c3 = new GradedCourse("Programming", 4);
        GradedCourse c4 = new GradedCourse("Algorithms", 3);
        Project project = new Project(c1, c2, c3, c4);
        System.out.println(project.Passed());
  }

}
