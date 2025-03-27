public class Car {
    String model;
    int year;

    public Car(String model) {
        this.model = model;
    }

    public Car(int year, String model) {
        this.year = year;
        this.model = model;
    }

    public void makeBeBe() {
        if (year > 2000) {
            System.out.println(model + " - Хорошая машина");
        } else {
            System.out.println(model + " - Year not found or < 2000");
        }
    }
}