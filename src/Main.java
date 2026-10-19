
public class Main {


    public static void main(String[] args) {
        
        University university = new University();
        Course course1 = new Course("Software Design2", "SDN2", 180);
        Course course2 = new Course("Signal Processing 2", "SGN2", 180);
        
        university.addCourse(course1);
        university.addCourse(course2);
        
        Student student1 = new Student("Ntheetseng Happy", "240390091");
        Student student2 = new Student("Kelebogile Mokone", "2508353863");
        
        university.addStudent(student1);
        university.addStudent(student2);
        
        student1.registerCourse(course1);
        student2.registerCourse(course2);
        
        student1.printRegisteredCourses();
        student2.printRegisteredCourses();
        
        
    }
    
}
