
public class Course {
    
    private String courseName;
    private String courseCode;
    private int credit;

    public Course(String courseName, String courseCode, int credit) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.credit = credit;
    }
    
    String getCourseInfo(){
    return courseName + " (" + courseCode + "), " + credit + " credits";
    }
    
}
