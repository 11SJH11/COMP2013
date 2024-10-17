package Lab3Package;

public class Zookeeper extends Employee{


    public Zookeeper(String name) {
        super(name);
    }

    @Override
    public int calculateChristmasBonus() {
        return (int) (salary * 0.05 + 100);
    }
}
