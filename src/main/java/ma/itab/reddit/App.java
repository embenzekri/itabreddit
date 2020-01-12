package ma.itab.reddit;

public class App {
    public static void main(String[] args) {
        Car car = new Car();
        try{
            System.out.println(car.start());
            System.out.println(car.start());
            System.out.println(car.start());
        } catch (Exception ex){
            System.out.println("sending email " + ex.getMessage());
        }

    }
}

class Car {
    private Engine engine = new Engine();

    public boolean start() throws NotEnoughFuelException {
        return engine.startEngine();
    }
}

class Engine {
    private Tank tank = new Tank();

    public boolean startEngine() throws NotEnoughFuelException {
        return tank.getFuel(100);
    }
}

class Tank {
    private int capacity = 150;

    public boolean getFuel(int quantity) throws NotEnoughFuelException {
        if (capacity >= quantity) {
            capacity -= quantity;
            return true;
        }
        else

            throw new NotEnoughFuelException(capacity, quantity);
    }
}

class NotEnoughFuelException extends Exception {

    public NotEnoughFuelException(int capacity, int quantity) {
        super("Not enough fuel, capcacity = " + capacity + " required = "+quantity);
    }
}


