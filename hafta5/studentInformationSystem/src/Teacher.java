public class Teacher {
    String name;
    String mobile;
    String branch;

    Teacher(String name, String mobile, String branch) {
        this.name = name;
        this.branch = branch;
        this.mobile = mobile;
    }

    void print() {
        System.out.println("Öğretmen");
        System.out.println("Adı       : " + this.name);
        System.out.println("Telefonu  : " + this.mobile);
        System.out.println("Bölümü    : " + this.branch);
    }
}
