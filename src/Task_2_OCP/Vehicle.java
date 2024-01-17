package Task_2_OCP;

/**
 * Абстрактный класс описывающий транспортное средство (ТС)
 */
public abstract class Vehicle {
    // Поля
    int maxSpeed;
    String type;

    /**
     * Конструктор
     * @param maxSpeed   максимальная скорость транспортного средства
     * @param type       тип транспортного средства
     */
    public Vehicle(int maxSpeed, String type) {
        this.maxSpeed = maxSpeed;
        this.type = type;
    }

    /**
     * Метод получения максимальной скорости ТС
     */
    public int getMaxSpeed() {
        return maxSpeed;
    }

    /**
     * Метод получения типа ТС
     */
    public String getType() {
        return type;
    }

    /**
     * Абстрактный метод для расчета допустимой скорости
     */
    public abstract double calculateAllowedSpeed();
}
