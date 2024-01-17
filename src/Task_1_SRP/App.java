package Task_1_SRP;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {

        LocalDate dob = LocalDate.of(1990, 1, 16);

        EmployeeInfo employee = new EmployeeInfo("Дарья", dob, 35000);
        System.out.println("Работник: " + employee.getEmpInfo());
        System.out.println("Зарплата: " + employee.calculateNetSalary() + " рублей");

    }
}
