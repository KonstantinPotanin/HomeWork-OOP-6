package Task_2_OCP;

public class App {
    public static void main(String[] args) {

        Car car = new Car(120);
        Bus bus = new Bus(100);

        SpeedCalculation speedCalculation = new SpeedCalculation();

        double speedCar = speedCalculation.calculateAllowedSpeed(car);
        double speedBus = speedCalculation.calculateAllowedSpeed(bus);

        System.out.println("Скорость автомобиля: " + speedCar + " км/ч");
        System.out.println("Скорость автобуса: " + speedBus + " км/ч");
    }
}
