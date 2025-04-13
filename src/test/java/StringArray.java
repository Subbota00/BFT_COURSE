import java.util.Random;

public class StringArray {
    public static void main(String[] args) {
        String[] words = {"привет", "ПОКА", "гипербола"};
        System.out.println("Первая строка в верхнем регистре: " + words[0].toUpperCase());
        System.out.println("Вторая строка в нижнем регистре: " + words[1].toLowerCase());
        for (String word: words) {
            if (word.length() >=4) {
                if (Character.toLowerCase(word.charAt(1)) == 'о') {
                    String newWord = word.substring(0,3) + " " + word.substring(3);
                    System.out.println("Результат обработки строки: " + newWord);
                }
            }
        }
        Random random = new Random();
        int randomIndex = random.nextInt(3); {
            System.out.println("Случайная строка: " + words[randomIndex]);
        }
    }
}