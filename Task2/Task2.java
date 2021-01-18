/*
   Создать программу, которая будет вычислять и выводить на экран НОК (наименьшее общее кратное) и НОД (наибольший общий делитель)
       двух целых чисел, введенных пользователем.
           Если пользователь некорректно введёт хотя бы одно из чисел, то сообщать об ошибке.
 */


public class Task2 {
    public static void main( String[] args ) {
        IntegerReader integerReader = new IntegerReader(System.in);
        System.out.println("input two integer numbers:");
        int number1 = integerReader.ReadInt();
        int number2 = integerReader.ReadInt();

        int gcd = IntegerUtilities.GreatestCommonDivisor(number1, number2);
        int lcm = IntegerUtilities.LeastCommonMultiple(number1, number2);
        System.out.printf("LCM(%d, %d) = %d\n",number1,number2,gcd);
        System.out.printf("GCF(%d, %d) = %d\n",number1,number2,lcm);
    }

}
