package homework;

/*
1. Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
2. Создать множество ноутбуков.
3. Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
“Введите цифру, соответствующую необходимому критерию:
    1 - ОЗУ
    2 - Объем ЖД
    3 - Операционная система
    4 - Цвет …
4. Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
5. Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
*/

// ВЫПОЛНЕНО СОВМЕСТНО С РЯБОВЫМ АНДРЕЕМ

public class Main {
    public static void main(String[] args) {
        Model model = new Model();

        Controller controller = new Controller(model);
        controller.main();

    }
}