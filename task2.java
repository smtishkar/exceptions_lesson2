public class task2 {
    /*
     * Если необходимо, исправьте данный код
     * try {
     * int d = 0;
     * double catchedRes1 = intArray[8] / d;
     * System.out.println("catchedRes1 = " + catchedRes1);
     * } catch (ArithmeticException e) {
     * System.out.println("Catching exception: " + e);
     * }
     */
    public static void main(String[] args) {
        // int [] intArray = new int[10];
        // int [] intArray = new int[]{1,2,3,4,5,6};
        int[] intArray = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int d = 45;
        int numerator;

        try {
            numerator = intArray[8];
            if (d > 0) {
                double catchedRes1 = (double) numerator / d;

                System.out.println("catchedRes1 = " + catchedRes1);
            } else {
                System.out.println("Знаменатель не может быть равен или меньше 0");
            }

        } catch (Exception e) {
            System.out.println("Выбранное число для числителя за пределами массива");
        }
    }
}
