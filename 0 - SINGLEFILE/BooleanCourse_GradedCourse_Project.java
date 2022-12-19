class BooleanCourse {
    private String  courseName;
    private boolean passed;

    public BooleanCourse(String courseName, boolean passed) {
        this.courseName = courseName;
        this.passed     = passed;
    }
    public boolean passed() {
        return passed;
    }
}

class GradedCourse {
    private String courseName;
    private double grade;

    public GradedCourse(String courseName, double grade) {
        this.courseName = courseName;
        this.grade      = grade;
    }
    public boolean passed() {
        return grade >= 5;
    }
}
class Project {
    private BooleanCourse course1, course2;
    private GradedCourse  course3, course4;

    public Project(BooleanCourse course1, BooleanCourse course2, GradedCourse course3, GradedCourse course4) {
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
        this.course4 = course4;
    }
    public boolean passed() {
        int coursePassed = 0;
        if (course1.passed())
            coursePassed++;
        if (course2.passed())
            coursePassed++;
        if (course3.passed())
            coursePassed++;
        if (course4.passed())
            coursePassed++;
        return coursePassed >= 3;
    }
}
public class BooleanCourse_GradedCourse_Project {
    public static void main(String[] args) {
        BooleanCourse course1 = new BooleanCourse("Math", true);
        BooleanCourse course2 = new BooleanCourse("English", false);
        GradedCourse  course3 = new GradedCourse("Chemical", 3);
        GradedCourse  course4 = new GradedCourse("History", 6);
        Project project = new Project(course1, course2, course3, course4);
        System.out.println(project.passed());
    }
}