package Task_2_OCP;

public class Bus extends Vehicle {
    /**
     * Конструктор
     * @param maxSpeed максимальная скорость автобуса
     */
    public Bus(int maxSpeed) {
        super(maxSpeed, "Bus");
    }

    /**
     * Метод для расчета допустимой скорости
     */
    @Override
    public double calculateAllowedSpeed() {
        return getMaxSpeed() * 0.6;
    }
}
