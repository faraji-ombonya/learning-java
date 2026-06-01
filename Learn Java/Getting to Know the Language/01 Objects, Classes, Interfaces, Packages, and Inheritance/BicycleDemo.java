// An object is a software bundle of related state and behaviour

// An object stores its state in fields and exposes its behaviour 
// through methods

// Hiding internal state and requiring all interactions to be perfomed
// through and object's methods is known as encapsulation.

// A class is the blueprint from which objects are created.
class Bicycle {
    int cadence = 0;
    int speed = 0;
    int gear = 1;

    void changeCandence(int newValue) {
        cadence = newValue;
    }

    void changeGear(int newValue) {
        gear = newValue;
    }

    void speedUp(int increment) {
        speed = speed + increment;
    }

    void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    void printStates() {
        IO.println("cadence:" + cadence + " speed:" + speed + " gear:" + gear);
    }
}

class BicycleDemo {
    public static void main(String[] args) {
        // Create two different Bicycle objects
        Bicycle bike1 = new Bicycle();
        Bicycle bike2 = new Bicycle();

        // Invoke methods on those objects
        bike1.changeCandence(50);
        bike1.speedUp(10);
        bike1.changeGear(2);
        bike1.printStates();

        bike2.changeCandence(50);
        bike2.speedUp(10);
        bike2.changeGear(2);
        bike2.changeCandence(40);
        bike2.speedUp(10);
        bike2.changeGear(3);
        bike2.printStates();
    }
}

class MountainBike extends Bicycle {
    // new fields and methods defining a mountain bike would go here
}

