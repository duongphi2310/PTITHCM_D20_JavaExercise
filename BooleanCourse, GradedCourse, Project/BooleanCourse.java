public class BooleanCourse {
    private String courseName;
    private boolean grade;
    
    public BooleanCourse (String courseName, boolean grade) {
        this.courseName = courseName;
        this.grade      = grade;
    }
    public boolean Passed() {
        return grade;
    }
}