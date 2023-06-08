import java.util.Scanner;

/**
 * Реализуйте метод, который запрашивает у пользователя ввод дробного числа
 * (типа float),
 * и возвращает введенное значение. Ввод текста вместо числа не должно приводить
 * к падению приложения,
 * вместо этого, необходимо повторно запросить у пользователя ввод данных.
 * 
 */
public class task1 {

    public static void main(String[] args) {
        System.out.println("Результат вычесления " + devider());

    }

    public static float devider() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Введите дробное число (Тип - float): ");
                String input = scanner.nextLine();
                return Float.parseFloat(input);
            } catch (NumberFormatException e) {
                System.out.println("Попробуй еще раз");
            }
            // scanner.close();
        }
    }
}