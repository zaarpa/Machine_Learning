package Assignment_2.ContentCoupling;

public class Employee {
    String name, ID ;
    String managerName, managerAddress, managerID;
    int salary;
    int managerSalary;
    public void setManager(Manager manager){
        this.managerName= manager.name;
        this.managerAddress= manager.Address;
        this.managerID=manager.EmployeeID;
        this.managerSalary=manager.salary;
    }
}
