/*
1) Написать метод, который принимает массив элементов, помещает их в стэк и выводит на консоль содержимое стэка.
2) Написать метод, который принимает массив элементов, помещает их в очередь и выводит на консоль содержимое очереди.
*/

package seminar4;

import java.util.Stack;

public class task3 {
    public static void main(String[] args) {
        fillPrintStack(new int[] { 2, 6, 2, 9, 6 });
    }

    public static void fillPrintStack(int[] itemNumbers) {

        Stack<Integer> stackNumber = new Stack<Integer>();

        for (int num : itemNumbers) {
            stackNumber.push(num);
        }

        while (!stackNumber.isEmpty()) {
            System.out.println(stackNumber.pop());
        }
    }
}