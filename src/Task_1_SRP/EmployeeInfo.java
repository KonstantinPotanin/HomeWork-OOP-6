package Task_1_SRP;

import java.time.LocalDate;

/**
 * Класс в котором объединены классы работника и выплаты зарплаты
 */
public class EmployeeInfo {
    // Поля
    private Employee employee;
    private SalaryCalculator salary;

    /**
     * Конструктор
     * @param name Имя работника
     * @param dob Дата рождения работника
     * @param baseSalary Оклад
     */
    public EmployeeInfo(String name, LocalDate dob, int baseSalary) {
        this.employee = new Employee(name, dob);
        this.salary = new SalaryCalculator(baseSalary);
    }

    public String getEmpInfo() {
        return employee.getEmpInfo();
    }

    public int calculateNetSalary() {
        return salary.calculateNetSalary();
    }

}
