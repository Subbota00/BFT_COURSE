public class UseEmployee {
    public static void main(String[] args) {
        Employee manager = new Manager("Анна", 80000);
        Employee developer = new Developer("Иван", 110000);
        manager.work();
        developer.work();
    }
}