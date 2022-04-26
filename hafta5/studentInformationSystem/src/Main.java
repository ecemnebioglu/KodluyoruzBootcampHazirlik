public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Irmak Uzun", "0000", "FZK");
        Teacher t2 = new Teacher("Lütfi Hoca", "1111", "KMY");
        Teacher t3 = new Teacher("Başak Arın", "2222", "BIO");

        Course fizik = new Course("Fizik", "101", "FZK");
        fizik.addTeacher(t1);
        Course kimya = new Course("Kimya", "102", "KMY");
        System.out.println("==========================");
        kimya.addTeacher(t2);
        Course biyoloji = new Course("Biyoloji", "103", "BIO");
        System.out.println("==========================");
        biyoloji.addTeacher(t3);
        System.out.println("==========================");

        Student s1 = new Student("Fatma Kısık", "1235", "12", fizik, kimya, biyoloji);
        s1.addBulkExamNote(88,66,33,95,60,15);
        s1.printNote();

    }
}
