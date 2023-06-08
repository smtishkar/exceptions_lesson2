import java.util.Scanner;

public class task4 {
    /*
     * Разработайте программу, которая выбросит Exception, когда пользователь вводит
     * пустую строку.
     * Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
     * Далее запросить повторный ввод строки
     */

    public static void main(String[] args) {

        alert();

    }

    /*
     * Первый вариант без Exception, просто if и while
     */
    public static void alert() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите то что вы хотите найти: ");
        String input = scanner.nextLine();
        while (input == null || input.trim().isEmpty()) {
            System.out.println("Вы не ввели запрос или строка пустая. Попробуйте еще раз: ");
            input = scanner.nextLine();
        }
        System.out.println("Вы искали " + input + " и мы что-то нашли");
        scanner.close();
    }

    // /*
    // * Второй вариант просто выбрасывает exception, но повторный ввод не сдела. Не
    // получавется
    // */

    // public static void alert() {
    // Scanner scanner = new Scanner(System.in);
    // System.out.println("Введите то что вы хотите найти: ");
    // String input = scanner.nextLine();
    // while (input == null || input.trim().isEmpty()) {
    // throw new RuntimeException("Вы не ввели запрос или строка пустая. Попробуйте
    // еще раз: ");
    // // System.out.println("Вы не ввели запрос или строка пустая. Попробуйте еще
    // раз: ");
    // // input = scanner.nextLine();
    // }
    // System.out.println("Вы искали " + input + " и мы что-то нашли");
    // scanner.close();
    // }

}
