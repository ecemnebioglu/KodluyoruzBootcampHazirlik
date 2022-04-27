public class Employee {
    String name;
    double salary;
    int workingHours;
    int yearOfEmployment;
    double tax;
    double bonus;
    double salaryIncrease;

    Employee(String name, double salary, int workingHours, int yearOfEmployment) {
        this.name = name;
        this.salary = salary;
        this.workingHours = workingHours;
        this.yearOfEmployment = yearOfEmployment;
    }

    double tax() {
        if (salary < 1000.0) {
            tax = 0.0;
        } else {
            tax = salary * 0.03;
        }
        return tax;
    }

    double bonus() {
        if (workingHours > 40) {
            bonus = (workingHours - 40) * 30;
        }
        return bonus;
    }

    double salaryIncrease() {
        int sub = 2022 - yearOfEmployment;
        if (sub < 10) {
            salaryIncrease = salary * 0.05;
        } else if (sub > 9 && sub < 20) {
            salaryIncrease = salary * 0.1;
        } else if (sub > 19) {
            salaryIncrease = salary * 0.15;
        }
        return salaryIncrease;
    }

    void print() {
        System.out.println("Personel ");
        System.out.println("Adı : " + this.name);
        System.out.println("Maaşı : " + this.salary);
        System.out.println("Çalışma Saati : " + this.workingHours);
        System.out.println("İşe Başlama Tarihi : " + this.yearOfEmployment);
        System.out.println("Vergi : " + tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Maaş Artışı : " + salaryIncrease());
        System.out.println("Vergi ve Bonuslarla Birlikte Maaş : " + (tax() + salary + bonus()));
        System.out.println("Toplam Maaş : " + (salary + tax() + bonus() + salaryIncrease()));
        System.out.println("=========================================");
    }
}
