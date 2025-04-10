package number4;

import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        for (int i = 0; i < employees.length; i++) {
            employees[i] = new Employee(generateRandomName(), generateRandomPosition(),
                    "employee" + i + "@mail.ru", "+375" +
                    (543678000 + new Random().nextInt(100000)),
                    30000 + new Random().nextInt(70001),
                    25 + new Random().nextInt(30));
        }
        for (Employee emp : employees) {
            if (emp.getAge() > 40) {
                emp.printInfo();
                System.out.println();
            }
        }
    }
    static String generateRandomName() {
        String[] names = {"Bob", "Tom","Jack","George", "Morgenshtern"};
        return names[new Random().nextInt(names.length)];
    }
    static String generateRandomPosition() {
        String[] positions = {"Manager", "Developer", "Teacher", "Saver", "King"};
        return positions[new Random().nextInt(positions.length)];
    }
}
class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;
    public Employee(String fullName, String position, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public int getAge() {
        return age; }
    public void printInfo() {
        System.out.println("ФИО: " + fullName);
        System.out.println("Должность: " + position);
        System.out.println("Email: " + email);
        System.out.println("Телефон: " + phone);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
    }
}
