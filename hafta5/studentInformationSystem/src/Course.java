public class Course {
    String name;
    String code;
    String prefix;
    int exam;
    int quiz;
    Teacher teacher;

    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int note = 0;
        int quiz = 0;
    }

    void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
            printTeacherInfo();
        } else {
            System.out.println("Öğretmen ve Dersin bölümleri uyuşmuyor ! ");
        }
    }

    void printTeacherInfo() {
        this.teacher.print();
    }


}
