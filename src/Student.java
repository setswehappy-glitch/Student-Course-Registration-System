import java.util.ArrayList;
public class Student {
    
    private String name;
    private String studentId;
    private ArrayList<Course>registeredCourses;

    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
        this.registeredCourses = new ArrayList<>();
    }
    
    public void registerCourse(Course course){
    this.registeredCourses.add(course);
    }
    public void printRegisteredCourses(){
    for(Course course : registeredCourses)
    {
        System.out.println(name + " " + studentId + "\nRegistered Course: ");
        System.out.println(course.getCourseInfo());
    }
    }
    
}
