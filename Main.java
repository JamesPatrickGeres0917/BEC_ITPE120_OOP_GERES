public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 2022, 4);
        myCar.start();
        myCar.accelerate();
        myCar.stop();
        myCar.displayCarInfo();
    }
}