package Task_4_LSP;

/**
 * Класс описывающий прямоугольник
 */
public class Rectangle extends Shape{
    private int width;
    private int height;

    /**
     * Конструктор для прямоугольника
     * @param width     ширина
     * @param height    высота
     */
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    /**
     * Конструктор для квадрата
     * @param width ширина
     */
    public Rectangle(int width) {
        this(width, width);
    }

    // Методы
    public void setWidth(int width) {
        this.width = width;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    @Override
    public double area() {
        return this.width * this.height;
    }
}
