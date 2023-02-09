/*
1. Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
2. Создать множество ноутбуков.
3. Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
“Введите цифру, соответствующую необходимому критерию:
    1 - ОЗУ
    2 - Объем ЖД
    3 - Операционная система
    4 - Цвет …
4. Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
5. Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
*/

package homework;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Laptop> laptops = new ArrayList<>();
        Laptop laptop = new Laptop("Apple",
                "MacBook Pro 16",
                LocalDate.of(2021, 10, 26), 
                "Apple M1 Pro", 16, 512, "MacOS",
                "SpaceGrey");
                laptops.add(laptop);
                
                laptop = new Laptop("Apple",
                "MacBook Pro 16",
                LocalDate.of(2021, 10, 26), 
                "Apple M1 Pro", 8, 256, "MacOS",
                "Silver");
                laptops.add(laptop);

                laptop = new Laptop("Huawei",
                "MateBook X Pro",
                LocalDate.of(2022, 10, 26), 
                "Intel Core i7-1260P", 16, 1024, "Windows 10",
                "Ink Blue");
                laptops.add(laptop);

                laptop = new Laptop("Honor",
                "MagicBook Pro",
                LocalDate.of(2022, 10, 26), 
                "AMD Ryzen 5 4600H", 16, 512, "Windows 10",
                "Silver");
                laptops.add(laptop);
                               
        
                for (Laptop l: laptops){
                    System.out.println(l);
                }
    }
}