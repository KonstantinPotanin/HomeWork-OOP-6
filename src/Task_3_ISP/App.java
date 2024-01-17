package Task_3_ISP;

public class App {
    public static void main(String[] args) {

        // Создаем объекты форм
        Circle circle = new Circle(4);
        Cube cube = new Cube(4);

        System.out.println("Площадь круга " + circle.area());
        System.out.println("Площадь куба " + cube.area());
        System.out.println("Объем куба " + cube.volume());
    }
}
