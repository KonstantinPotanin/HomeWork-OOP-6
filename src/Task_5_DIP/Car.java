package Task_5_DIP;

/**
 * Класс описывающий автомобиль
 */
public class Car {
    private Engine engine;

    /**
     * Конструктор
     * @param engine вариант двигателя
     */
    public Car(Engine engine) {
        this.engine = engine;
    }

    /**
     * Метод запуска двигателя
     */
    public void start() {
        this.engine.start();
    }
}
