package Task_3_ISP;

/**
 * Клас описывающий форму куба
 */
public class Cube implements Shape, VolumeShape {
    // Поле
    private int edge;

    /**
     * Конструктор
     * @param edge ребро куба
     */
    public Cube(int edge) {
        this.edge = edge;
    }
    /**
     * Метод для нахождения площади куба
     */
    @Override
    public double area() {
        return 6 * edge * edge;
    }
    /**
     * Метод для нахождения объема куба
     */
    @Override
    public double volume() {
        return edge * edge * edge;
    }
}
