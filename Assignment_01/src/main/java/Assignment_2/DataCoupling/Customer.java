package Assignment_2.DataCoupling;

public class Customer {
    String name;
    String customerID;
    String Address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        this.Address = address;
    }
    public void BuyCar(){
        Car car = new Car();
        car.setModel("Mustang-GT");
        car.setPrice(4032770);
    }
}
