public class Employee {
    private final String name;
    private final double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void work() {
        System.out.println(name + " выполняет рабочие задачи. Полуает зарплату - " + salary);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}