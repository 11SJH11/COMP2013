package Lab3Package;

public class ZooApp {
    public static void main(String[] args){

        Zoo zoo1 = new Zoo("London", 30);
        Zoo zoo2 = new Zoo("Tokyo", 20);
        Zoo zoo3 = new Zoo("New York", 32);
        Zoo zoo4 = new Zoo("Paris", 45);
        Zoo zoo5 = new Zoo("Beeston", 25);

        ZooCorp megaZoo = new ZooCorp(zoo1);
        megaZoo.addZoo(zoo2);

        System.out.println("Total number of zoos = " + Zoo.numZoos);

        System.out.println(zoo1.printInfo());
        System.out.println(zoo2.printInfo());
        System.out.println(zoo3.printInfo());
        System.out.println(zoo4.printInfo());
        System.out.println(zoo5.printInfo());
        zoo5.buildNewCompound();
        System.out.println(zoo5.printInfo());

        Employee sue = new Zookeeper("Sue");
        Employee john = new Zookeeper("John");

        megaZoo.addStaff(sue);
        megaZoo.addStaff(john);
        sue.setSalary(1909);
        john.setSalary(3500);

        System.out.println(sue.getEmployeeName()+ " is a "+ sue.getClass().getSimpleName() + " " + sue.calculateChristmasBonus());
        System.out.println(john.getEmployeeName()+ " is a "+ john.getClass().getSimpleName() + " " + john.calculateChristmasBonus());


    }
}
