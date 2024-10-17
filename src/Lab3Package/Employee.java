package Lab3Package;

public abstract class Employee implements Employable{
    private int employeeID;
    public int salary;
    private String employeeName;

    public Employee(String name){
        this.setEmployeeName(name);
    }

    public void setEmployeeID(int number){
        this.employeeID = number;
    }

    public int getEmployeeID(){
        return employeeID;
    }

    public void setEmployeeName(String name){
        this.employeeName = name;
    }

    public String getEmployeeName(){
        return employeeName;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public int getSalary(){
        return salary;
    }
}
