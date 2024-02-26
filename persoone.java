public class Person {
    protected int age;
    protected int healthPoints;

    public Person() {
        this.age = 0;
        this.healthPoints = 100;
    }

    public void age() {
        age++;
        if (age > 70 || healthPoints <= 0) {
            System.out.println("This person has passed away.");
            healthPoints = 0;
        }
    }


    public int getAge() {
        return age;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }
}

public class Commoner extends Person {
    protected int money;

    public Commoner() {
        this.money = 50;
    }

    public int produce() {
        return money / 10;
    }


    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void payTaxes(int amount) {
        money -= amount;
    }
}

public class Farmer extends Commoner {
    private int capacity;
    private int healthPoints;

    public Farmer() {
        this.capacity = 20;
        this.healthPoints = 40;
    }
}