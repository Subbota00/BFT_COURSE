package other;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UseArray {
    public static void main(String[] args) {
        List<Box> boxes = new ArrayList<>();
        boxes.add(new Box(10, 10, 10));
        boxes.add(new Box(20, 20, 25));
        boxes.add(new Box(25, 40, 15));
        boxes.add(new Box(40, 15, 10));
        boxes.add(new Box(35, 50, 60));

        List<Box> bigWidthBoxes = new ArrayList<>();

        Iterator<Box> iterator = boxes.iterator();
        while (iterator.hasNext()) {
            Box box = iterator.next();
            if (box.getWidth() > 30) {
                bigWidthBoxes.add(box);
                iterator.remove();
            }
        }

        System.out.println("Коробки с шириной <= 30 см :");
        boxes.forEach(System.out::println);

        System.out.println("Коробки с шириной  > 30 см:");
        bigWidthBoxes.forEach(System.out::println);
    }
}