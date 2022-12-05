public class Project {
    private BooleanCourse c1, c2;
    private GradedCourse  c3, c4;

    public Project (BooleanCourse c1, BooleanCourse c2, GradedCourse c3, GradedCourse c4) {
        this.c1 = c1;
        this.c2 = c2; 
        this.c3 = c3;
        this.c4 = c4;
    }
    public boolean Passed() {
        return (c1.Passed() && c2.Passed() && c3.Passed() && c4.Passed()) ||
               (!(c1.Passed()) && c2.Passed() && c3.Passed() && c4.Passed()) ||
               (c1.Passed() && !(c2.Passed()) && c3.Passed() && c4.Passed()) ||
               (c1.Passed() && c2.Passed() && !(c3.Passed()) && c4.Passed()) ||
               (c1.Passed() && c2.Passed() && c3.Passed() && !(c4.Passed()));
   }
}