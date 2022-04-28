public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;


    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void fight() {
        if (isCheckWeight()) {
            int i = 1;
            while (this.f1.health > 0 && this.f2.health > 0) {
                if (startingChance()) {
                    System.out.println("============================== " + i + ". Round ==============================");
                    i++;
                    f2.health = f1.hit(f2);
                    if (isWin()) {
                        break;
                    }
                    f1.health = f2.hit(f1);
                    if (isWin()) {
                        break;
                    }
                    printScore();
                } else {
                    System.out.println("============================== " + i + ". Round ==============================");
                    i++;
                    f1.health = f2.hit(f1);
                    if (isWin()) {
                        break;
                    }
                    f2.health = f1.hit(f2);
                    if (isWin()) {
                        break;
                    }
                    printScore();
                }
            }
        } else {
            System.out.println("Sporcuların sikletleri min-max weight aralığında değildir. ");

        }
    }

    boolean isCheckWeight() {
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    boolean isWin() {
        if (f1.health == 0) {
            System.out.println("Müsabakanın Galibi " + f2.name);
            return true;
        } else if (f2.health == 0) {
            System.out.println("Müsabakanın Galibi " + f1.name);
            return true;
        }
        return false;
    }

    void printScore() {
        System.out.println(f1.name + " Kalan Canı : " + f1.health);
        System.out.println(f2.name + " Kalan Canı : " + f2.health);
    }

    boolean startingChance() {
        double startingChance = 50.0;
        double randomValue = Math.random() * 100;
        return randomValue <= startingChance;
    }

}
