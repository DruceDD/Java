package task2;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>();
        Cat cat = new Cat("Барсик",
                "Сибирская",
                LocalDate.of(2006, 12, 6),
                "Людмила");
                cat.addVaccination(new Vaccination(LocalDate.now(), "от бешенства"));
                cat.addVaccination(new Vaccination(LocalDate.of(2012, 5, 6), "комплекс"));
                cats.add(cat);
                
                cat = new Cat("Мурзик",
                "Персидская",
                LocalDate.of(2015, 6, 17),
                "Евгения");
                cat.addVaccination(new Vaccination(LocalDate.now(), "от бешенства"));
                cat.addVaccination(new Vaccination(LocalDate.of(2017, 5, 25), "комплекс"));
                cats.add(cat);
        
                for (Cat c: cats){
                    System.out.println(c);
                }
    }
}
