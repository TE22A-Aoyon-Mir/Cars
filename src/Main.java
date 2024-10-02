import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Working with cars");

        //Datatype variableName = create the object
        //Create a car
        Car car1 = new Car("Hudson", "Blue", 200);

        //Give the attributes values
        //car1.name = "Hudson";
        //car1.color = "Blue";
        //car1.maxSpeed = 200;

        //Create a second car
        Car car2 = new Car("Mater", "Brun", 100);

        car1.speedUp(115);
        car2.speedUp(200);

        //Car[] myCars = new Car[10]; this is a static array
        ArrayList<Car> myCars = new ArrayList<>();
        //Add the cars to the list
        myCars.add(car1);
        myCars.add(car2);
        myCars.add(new Car("Lughnting McQueen", "red", 400));

        System.out.println(car1.getName() + " is " + car1.getColor() + " and has max speed of " + car1.getMaxSpeed());
        System.out.println(car2.getName() + " is " + car2.getColor() + " and has max speed of " + car2.getMaxSpeed());

        Car theCar = myCars.get(2);
        System.out.println(theCar.getName() + " is " + theCar.getColor() + " and has max speed of " + theCar.getMaxSpeed());
    }
}