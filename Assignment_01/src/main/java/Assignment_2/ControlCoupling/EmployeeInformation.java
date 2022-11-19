package Assignment_2.ControlCoupling;

public class EmployeeInformation {
    public String getEmployeeInformation(Employee employee, int informationType){
        if(informationType==1){
            return employee.getName();
        }
        else
        {
            return employee.getDesignation();
        }
    }
}
