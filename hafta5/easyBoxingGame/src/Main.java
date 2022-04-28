public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Jin Kazama ", 20,100,75, 50);
        Fighter f2 = new Fighter("Hwoarang", 20,100,68,50);

        Match match = new Match(f1,f2,65,75);
        match.fight();

    }
}
