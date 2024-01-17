package Task_2_OCP;

public class Car extends Vehicle {

    /**
     * Конструктор
     * @param maxSpeed максимальная скорость автомобиля
     */
    public Car(int maxSpeed) {
        super(maxSpeed, "Car");
    }

    /**
     * Метод для расчета допустимой скорости
     */
    @Override
    public double calculateAllowedSpeed() {
        return getMaxSpeed() * 0.8;
    }
}
