package lab.week.pkg3;


public class Car {
     
    
    String plateNumber;
    String model;
    double mileage;
    double fuelLevel;
    double tankCapacity;

   
    public Car(String plateNumber, String model, double fuelLevel, double tankCapacity) {
        this.plateNumber = plateNumber;
        this.model = model;
        this.mileage = 0.0;
        this.fuelLevel = fuelLevel;
        this.tankCapacity = tankCapacity;
    }

    public void drive(double km) {
        double fuelNeeded = km / 10.0;

        if (fuelNeeded > this.fuelLevel) {
            System.out.println("Not enough fuel for this trip!");
        } else {
            this.mileage += km;
            this.fuelLevel -= fuelNeeded;
            System.out.println("Driving " + km + " km...");
        }
    }

 
    public void refuel(double amount) {
        System.out.println("Refueling " + amount + " liters...");
        if (this.fuelLevel + amount > this.tankCapacity) {
            this.fuelLevel = this.tankCapacity;
            System.out.println("Tank is full, extra fuel discarded.");
        } else {
            this.fuelLevel += amount;
        }
    }

   
    public void checkStatus() {
        System.out.println("Current Mileage: " + this.mileage + " km | Fuel Level: " + this.fuelLevel + "/" + this.tankCapacity + " L");
        
       
        if (this.fuelLevel < (this.tankCapacity * 0.10)) {
            System.out.println("Low fuel warning!");
        }
        System.out.println();
    }
}
    
    
    
    
    
    

