package Task_5_DIP;

public class App {
    public static void main(String[] args) {

        // Создаем объекты двигателей
        Engine petrolEngine = new PetrolEngine();
        Engine dieselEngine = new DieselEngine();

        // Создаем объекты автомобилей
        Car petrolCar = new Car(petrolEngine);
        Car dieselCar = new Car(dieselEngine);

        // Запускаем двигатели
        petrolCar.start();
        dieselCar.start();
    }
}
