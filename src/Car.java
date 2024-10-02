public class Car {
    //Attributes
    private String color; //No standard value is given
    private int speed = 0; //Is given speed 0 if nothing else is given
    private String name;
    private int maxSpeed;

    //Constructor
    public Car(String incomingName, String incomingColor, int incomingMaxSpeed) {
        name = incomingName;
        color = incomingColor;
        maxSpeed = incomingMaxSpeed;
    }

    public Car() {
    } //Default constructor

    //Methods
    //public void methodName(inputparameters){}
    public void speedUp(int change) {
        if (speed + change < maxSpeed) {
            speed = speed + 300;
            System.out.println(name + " now has speed of " + speed);
        } else {
            System.out.println("You cannot exceed your max speed");
        }
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}
