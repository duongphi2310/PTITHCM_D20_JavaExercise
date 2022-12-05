public class GradedCourse {
    private String courseName;
    private double grade;
    
    public GradedCourse(String courseName, double grade) {
        this.courseName = courseName;
        this.grade      = grade;
    }
    public boolean Passed() {
        return grade >= 5;
    }
}
