import org.junit.jupiter.api.Test;

public class ResultCar {
    Car car = new Car(2003, "Ford");
    Car car2 = new Car("Mazda");

    @Test
    public void getCar() {
        car.makeBeBe();
        car2.makeBeBe();
    }
}