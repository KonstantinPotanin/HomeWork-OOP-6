package Task_3_ISP;

/**
 * Клас описывающий форму круга
 */
public class Circle implements Shape {
    // Поле
    private double radius;

    /**
     * Конструктор
     * @param radius радиус круга
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Метод для нахождения площади круга
     */
    @Override
    public double area() {
        return 2 * 3.14 * radius;
    }
}
