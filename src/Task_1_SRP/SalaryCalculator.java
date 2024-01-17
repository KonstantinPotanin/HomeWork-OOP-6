package Task_1_SRP;

public class SalaryCalculator {
    // Поле
    private int baseSalary;

    /**
     * Конструктор
     * @param baseSalary оклад
     */
    public SalaryCalculator(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    /**
     * Метод вычисления зарплаты
     */
    public int calculateNetSalary() {
        return (int) (baseSalary * 0.75);
    }
}
