public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    double dodge;


    Fighter(String name, int damage, int health, int weight, double dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }

    int hit(Fighter rival) {
        System.out.println(this.name + " ---> " + rival.name + "  " + this.damage + " hasar vurdu . ");
        if (rival.dodge()) {
            System.out.println(rival.name + " gelen hasarı dodgeladı . ");
            return rival.health;
        }
        if ((rival.health - this.damage) < 0)
            return 0;
        return rival.health - this.damage;
    }

    boolean dodge() {
        double randomValue = Math.random() * 100;
        return randomValue <= this.dodge;
    }

}
