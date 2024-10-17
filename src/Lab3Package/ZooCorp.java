package Lab3Package;

import java.util.ArrayList;

public class ZooCorp {
    private ArrayList<Zoo> zoos;
    private ArrayList<Employable> employees;

    public ZooCorp(Zoo zoo){
        zoos = new ArrayList<Zoo>();
        employees = new ArrayList<Employable>();
    }
    public void addZoo(Zoo zoo){
        this.zoos.add(zoo);
    }

    public void addStaff(Employable employee){
        this.employees.add(employee);
    }


}
