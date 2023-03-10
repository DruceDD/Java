/*
Напишите метод, который сжимает строку. 
Пример: aaaabbbcdd → a4b3cd2
*/

package seminar2;

import java.util.Scanner;

public class task2 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String line = scanner.nextLine();

        System.out.println(compressString(line));

  }

  public static String compressString(String userString) {
    StringBuilder result = new StringBuilder();
    int count = 0;

    for (int i = 0; i < userString.length() - 1; i++) {
      if (userString.charAt(i) == userString.charAt(i + 1)) {
        count++;
      } else if (userString.charAt(i) != userString.charAt(i + 1)) {
        count++;
        result.append(userString.charAt(i));
        if (count > 1) {
          result.append(count);
        }
        count = 0;
      }
      if (i == userString.length() - 2
          && userString.charAt(userString.length() - 2) != userString.charAt(userString.length() - 1)) {
        result.append(userString.charAt(i));
      } else if (i == userString.length() - 2
          && userString.charAt(userString.length() - 2) == userString.charAt(userString.length() - 1)) {
        count++;
        result.append(userString.charAt(i));
        result.append(count);
      }
    }
    return result.toString();
  }
}