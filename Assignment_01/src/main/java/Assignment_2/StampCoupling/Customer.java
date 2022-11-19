package Assignment_2.StampCoupling;


public class Customer {
        String name;
        String customerID;
        String Address;
        public void BuyCar(){
                Car car = new Car();
                car.setOwner(this.name);

        }

    }
