public class Main {

    public static void main(String[] args) {
        Student student1 = new Student("Ozan","Polat",1234);
        Course course1= new Course("Yazılım geliştirici yetiştirme kampı",1,"Java+React",0);

        UserManager userManager= new UserManager();
        userManager.add(student1);
        userManager.add(course1);
        userManager.delete(course1);
    }
}
