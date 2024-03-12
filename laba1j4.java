public class HW_4 {
    public static void main(String[] args) {
        int num = 5;

        num += 2; // эквивалентно num = num + 2
        System.out.println("Результат сложения с присваиванием: " + num);

        num -= 3; // эквивалентно num = num - 3
        System.out.println("Результат вычитания с присваиванием: " + num);

        num /= 2; // эквивалентно num = num / 2
        System.out.println("Результат деления с присваиванием: " + num);

        num *= 4; // эквивалентно num = num * 4
        System.out.println("Результат умножения с присваиванием: " + num);

        num++; // эквивалентно num = num + 1 или num += 1
        System.out.println("Результат инкремента: " + num);

        num--; // эквивалентно num = num - 1 или num -= 1
        System.out.println("Результат декремента: " + num);
    }
}