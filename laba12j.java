import java.util.*;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        linkedList.add("Мяч");
        linkedList.add("Корзина");
        linkedList.add("Самокат");
        linkedList.add("Телефон");

        System.out.println("Введите первый элемент ");
        String firstNewElement = scanner.nextLine();
        linkedList.addFirst(firstNewElement);

        System.out.println("Введите последний элемент ");
        String lastNewElement = scanner.nextLine();
        linkedList.addLast(lastNewElement);

        scanner.close();
        System.out.println("for");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }

        System.out.println("foreach");
        for (String element : linkedList) {
            System.out.println(element);
        }

        System.out.println("Last element of the list - " + lastNewElement);


        ArrayList<String> arrayList = new ArrayList<>(linkedList);
        Collections.sort(arrayList, Comparator.reverseOrder());
        System.out.println("ArrayList в порядке убывания: " + arrayList);

        Collections.sort(arrayList);
        System.out.println("ArrayList в порядке возрастания: " + arrayList);
    }
}