/* Создать программу, которая будет сообщать, является ли целое число, введенное пользователем,
      чётным или нечётным, простым или составным.  Если пользователь введёт не целое число,
            то сообщать ему об ошибке.
 */

public class Task1 {
    public static void main( String[] args ) {
        getDescriptionInput();
    }

}

    public static void getDescriptionInput() {
        int userInput = scanInt(0, Integer.MAX_VALUE);
        String description = "Число " + userInput;
        if (isPrime(userInput)) description += " простое и";
        else if (userInput >= 2) description += " составное и";
        if (isEven(userInput)) description += " четное";
        else description += " нечетное";
        System.out.println(description);
    }

    public static int scanInt(int a, int b) {
        Scanner in = new Scanner(System.in);
        int userInput;
        while (true) {
            System.out.println("Введите целое " +
                    "число в диапазоне [" + a + " .. " + b + "]: ");
            String s = in.nextLine();
            try {
                userInput = Integer.parseInt(s);
                if (userInput < a || userInput > b)
                    System.err.println("Не соответствует условиям ввода!");
                else
                    break;
            } catch (NumberFormatException e) {
                System.err.println("Не соответствует условиям ввода!");
            }
        }
        in.close();
        return userInput;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0 ? true : false;
    }

    public static boolean isPrime(int num) {
        if (num < 3) return num == 2;
        if (num % 2 == 0) return false;
        for (int i = num / 3; i >= 3; i -= 2) {
            if (isEven(i)) i--;
            if ((num % i) == 0)
                return false;
        }
        return true;
    }
}
