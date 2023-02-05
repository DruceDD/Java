/*
Пусть дан LinkedList с несколькими элементами. 
Реализуйте метод, который вернет “перевернутый” список.
*/

package seminar4;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class hw_task1_fix {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        LinkedList<String> userList = getUserList();

        System.out.println("Исходный список: " + Arrays.toString(userList.toArray()));

        System.out.println("Развернутый список: " + Arrays.toString(reverseLinkedList(userList).toArray()));
    }

    private static LinkedList<String> getUserList() {
        LinkedList<String> list = new LinkedList<>();
        System.out.println("Введите элемент списка (по окончании введите stop): ");

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("stop"))
                break;
            list.add(input);
        }
        return list;
    }

    private static LinkedList<String> reverseLinkedList(LinkedList<String> list) {
        LinkedList<String> newList = new LinkedList<>();

        for (int i = 0; i < list.size(); i++) {
            newList.addLast(list.get(list.size() - 1 - i));
        }

        return newList;
    }

}