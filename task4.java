import java.util.Scanner;

public class task4 {
    /*
     * Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
     * Пользователю должно показаться сообщение, что пустые строки вводить нельзя. 
     * Далее запросить повторный ввод строки
     */

     public static void main(String[] args) {
    
        alert();


     }


     public static void alert() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Введите то что вы хотите найти: ");
        String input = scanner.nextLine();
        if (input != null && !input.trim().isEmpty()){
        System.out.println("Вы искали " + input + " и мы что-то нашли");
        scanner.close(); 
    }      
        else {System.out.println("Вы не ввели запрос или строка пустая. Попробуйте еще раз");}
     }


}

