import java.util.Scanner;

public class HW_3 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

// Ввод переменных
System.out.print("Введите первое целое число: ");
int num1 = scanner.nextInt();

System.out.print("Введите второе целое число: ");
int num2 = scanner.nextInt();

System.out.print("Введите первое десятичное число: ");
double num3 = scanner.nextDouble();

System.out.print("Введите второе десятичное число: ");
double num4 = scanner.nextDouble();

// Операции с целыми числами
System.out.println("Сумма целых чисел: " + (num1 + num2));
System.out.println("Сумма целых чисел: " + (num1 + num3));
System.out.println("Сумма целых чисел: " + (num2 + num4));
System.out.println("Разность целых чисел: " + (num2 - num4));
System.out.println("Разность целых чисел: " + (num1 - num3));
System.out.println("Разность целых чисел: " + (num1 - num2));
System.out.println("Произведение целых чисел: " + (num1 * num2));
System.out.println("Произведение целых чисел: " + (num1 * num3));
System.out.println("Произведение целых чисел: " + (num2 * num4));
System.out.println("Частное целых чисел: " + (num1 / num2));
System.out.println("Частное целых чисел: " + (num1 / num3));
System.out.println("Частное целых чисел: " + (num2 / num4));
System.out.println("Остаток от деления целых чисел: " + (num1 % num2));
System.out.println("Остаток от деления целых чисел: " + (num1 % num3));
System.out.println("Остаток от деления целых чисел: " + (num2 % num4));

// Операции с десятичными числами
System.out.println("Сумма десятичных чисел: " + (num3 + num4));
System.out.println("Разность десятичных чисел: " + (num3 - num4));
System.out.println("Произведение десятичных чисел: " + (num3 * num4));
System.out.println("Частное десятичных чисел: " + (num3 / num4));
}
}