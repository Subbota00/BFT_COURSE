public class Developer extends Employee {
    public Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " пишет код. Получает зарплату - " + getSalary());
    }
}