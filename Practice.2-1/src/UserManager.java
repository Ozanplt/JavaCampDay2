public class UserManager {
    public void add(Student student){
        System.out.println(student.firstName + " eklendi");
    }
    public void add(Course course){
        System.out.println(course.courseName + " eklendi");

    }    public void delete(Student student){
        System.out.println(student.firstName + " silindi");
    }    public void delete(Course course){
        System.out.println(course.courseName + " silindi");
    }

}
