public class Student {
    String name;
    String stdntNo;
    String classes;
    Course c1;
    Course c2;
    Course c3;
    double average;
    double courseAverage1;
    double courseAverage2;
    double courseAverage3;
    boolean isPass;

    Student(String name, String stdntNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stdntNo = stdntNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0.0;
        this.courseAverage1 = 0.0;
        this.courseAverage2 = 0.0;
        this.courseAverage3 = 0.0;

        this.isPass = false;
    }

    void addBulkExamNote(int ex1, int ex2, int ex3, int qu1, int qu2, int qu3) {
        if (ex1 >= 0 && ex1 <= 100) this.c1.exam = ex1;
        if (ex2 >= 0 && ex2 <= 100) this.c2.exam = ex2;
        if (ex3 >= 0 && ex3 <= 100) this.c3.exam = ex3;
        if (qu1 >= 0 && qu1 <= 100) this.c1.quiz = qu1;
        if (qu2 >= 0 && qu2 <= 100) this.c2.quiz = qu2;
        if (qu3 >= 0 && qu2 <= 100) this.c3.quiz = qu3;
    }

    void printNote() {
        average();
        System.out.println(this.c1.name + "\t\t\tSınav Notu : " + this.c1.exam + " \t\tQuiz Notu : " + c1.quiz + " \t\tOrtalamanız : " + this.courseAverage1);
        System.out.println(this.c2.name + "\t\t\tSınav Notu : " + this.c2.exam + " \t\tQuiz Notu : " + c2.quiz + " \t\tOrtalamanız : " + this.courseAverage2);
        System.out.println(this.c3.name + "\t\tSınav Notu : " + this.c3.exam + " \t\tQuiz Notu : " + c3.quiz + " \t\tOrtalamanız : " + this.courseAverage3);
        System.out.println(" ");
        isPassCourse();
        System.out.println("");
        System.out.println("Genel Not Ortalamanız : " + this.average);
        isPass();
    }

    void average() {
        this.courseAverage1 = this.c1.exam * 0.6 + this.c1.quiz * 0.4;
        this.courseAverage2 = this.c2.exam * 0.6 + this.c2.quiz * 0.4;
        this.courseAverage3 = this.c3.exam * 0.6 + this.c3.quiz * 0.4;
        this.average = (this.courseAverage1 + this.courseAverage2 + this.courseAverage3) / 3.0;
    }

    void isPass() {
        if (this.average >= 55) {
            System.out.println("Sınıfı Geçtiniz ! ");
        } else {
            System.out.println("Sınıfta Kaldınız ! Seneye Tekrar Görüşmek Üzere :) ");
        }
    }
    void isPassCourse(){
        if (this.courseAverage1 >= 55) {
            System.out.println( c1.name + " Dersi Başarılı.");
        } else {
            System.out.println(c1.name + " Dersinden Kaldınız.");
        }
        if (this.courseAverage2 >= 55) {
            System.out.println(c2.name + " Dersi Başarılı.");
        } else {
            System.out.println(c2.name + " Dersinden Kaldınız.");
        }
        if (this.courseAverage3 >= 55) {
            System.out.println(c3.name + " Dersi Başarılı.");
        } else {
            System.out.println(c3.name + " Dersinden Kaldınız.");
        }
    }


}
