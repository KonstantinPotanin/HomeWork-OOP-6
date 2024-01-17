package Task_4_LSP;

public class App {
    public static void main(String[] args) {

        // Создаем объекты прямоугольников
        Rectangle rectangle = new Rectangle(4,3);
        Rectangle square = new Rectangle(4);

        System.out.println("Площадь прямоугольника равна " + rectangle.area());
        System.out.println("Площадь квадрата равна " + square.area());
    }
}
