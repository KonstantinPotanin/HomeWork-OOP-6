package Task_1_SRP;

import java.time.LocalDate;

public class Employee {
    // Поля
    private String name;
    private LocalDate dob;


    /**
     * Конструктор
     * @param name  Имя работника
     * @param dob   Дата рождения работника
     */
    public Employee(String name, LocalDate dob) {
        this.name = name;
        this.dob = dob;
    }

    /**
     * Метод вывода информации о работнике
     */
    public String getEmpInfo() {
        return "\nИмя - " + name + "\nДата рождения - " + dob.toString();
    }
}
