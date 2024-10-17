package Lab3Package;

public class Admin extends Employee{

    public Admin(String name) {
        super(name);
    }

    @Override
    public int calculateChristmasBonus() {
        return (int) (salary * 0.08);
    }
}
