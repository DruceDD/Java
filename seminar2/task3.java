/*
 * Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод, 
 * который запишет эту строку в простой текстовый файл, обработайте исключения.
 */
package seminar2;

import java.io.*;

public class task3 {
    public static void main(String[] args) throws IOException {
        String line = "empty";
        FileWriter fileWriter = null;
        try {
            // String pathProject = System.getProperty("user.dir");
            // String pathFile = pathProject.concat("/file.txt");
            File file = new File("file.txt");

            if (file.createNewFile()) {
                System.out.println("file.created");
            }
            else {
                System.out.println("file.existed");
                fileWriter = new FileWriter(file, true);
                fileWriter.write("new line");

                //#region lineSeparator
                // A string containing "\r\n" for non-Unix 
                // platforms, or a string containing 
                // "\n" for Unix platforms.
                fileWriter.append(System.lineSeparator());
                //#endregion

                fileWriter.write("new line");
                fileWriter.append("new line");
                // fileWriter.flush();
                fileWriter.close();
                // BufferedReader bufReader = new BufferedReader(new FileReader(file));
                // line = bufReader.readLine();
                // bufReader.close();
            }
        } catch (Exception e) {
            //e.printStackTrace();
        } finally {
            if (fileWriter != null) {
                fileWriter.close();
            }
            
        }
    }
}
