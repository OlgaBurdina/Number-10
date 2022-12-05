import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        System.out.println("Введите числа: ");
        String numbers = new Scanner(System.in).nextLine(); // для ввода пользователем
        Set<String> set = new HashSet<String>(); // Set хранит элемент только в одном экземпляре
        set.addAll(Arrays.asList(numbers.split(" "))); // формируем наш список
        System.out.println(set); // выводим список на экран
    }
}