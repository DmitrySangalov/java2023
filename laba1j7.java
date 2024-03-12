public class HW_7 {
    public static void main(String[] args) {
        int n = 72;
        int sum = 0;

        int firstDigit = n / 10; // получаем первую цифру числа (7)
        int secondDigit = n % 10; // получаем вторую цифру числа (2)

        sum = firstDigit + secondDigit; // вычисляем сумму цифр

        System.out.println("Сумма цифр " + n + " = " + sum);
    }
}