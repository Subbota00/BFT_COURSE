public class Manager extends Employee {
    public Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " управляет командой. Получает зарплату - " + getSalary());
    }
}