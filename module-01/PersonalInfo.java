public class PersonalInfo {
    public static void main(String[] args) {
        String name = "Sheikh Fatin Aman";
        int age = 21;
        double cgpa = 3.67;
        String university = "BRAC University";
        char grade = 'A';
        boolean graduated = false;

        String template = "Name : %s\nAge : %d\nUniversity : %s\nCGPA : %f\nGrade : %c\nGraduated : %b\n";
        System.out.printf(
            template, name, age, university, cgpa, grade, graduated
        );
    }
}
