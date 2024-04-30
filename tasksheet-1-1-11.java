class Task11 {
    public static void main(String[] args) {
        Car c1 = new Car("Toyota", "Fortuner", 2024, 4);
        Car c2 = new Car("Ford", "Mustang", 2022, 2);
        c1.displayDetails();
        c2.displayDetails();
    }
}

class Vehicle {
    String make;
    String model;
    int year;
    Vehicle(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }
}

class Car extends Vehicle {
    int numberOfDoors;
    Car(String make, String model, int year, int numberOfDoors){
        super(make, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    void displayDetails(){
        System.out.println("Car Details:\nMake: "+this.make+"\nModel: "+this.model+
        "\nYear: "+this.year+"\nNumber of Doors: "+this.numberOfDoors+"\n");
    }
}