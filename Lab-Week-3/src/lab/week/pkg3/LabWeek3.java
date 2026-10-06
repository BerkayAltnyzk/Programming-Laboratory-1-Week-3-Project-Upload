package lab.week.pkg3;

public class LabWeek3 {

   public class Main {
    public static void main(String[] args) {
       
        Car myCar = new Car("38 ABC 123", "Audi RS6", 15.0, 50.0);
        myCar.checkStatus();

      
        myCar.drive(120);
        myCar.checkStatus();

   
        myCar.drive(40);
        myCar.checkStatus();

      
        myCar.refuel(20);
        myCar.checkStatus();

       
        myCar.refuel(40);
        myCar.checkStatus();
    }
}
}