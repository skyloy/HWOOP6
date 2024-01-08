import java.awt.*;
import java.util.Arrays;
import java.util.List;

public class Homework {

    /**
     * 0. Разобраться со всеми принципами
     * 1. Написать класс, который выводит это число другого цвета. Цвет зависит от значения.
     * 1.1 Если число находится в диапазоне [0, 30] - цвет красный
     * 1.2 Если число находится в диапазоне [31, 75] - цвет желтый
     * 1.3 Если число находится в диапазоне [76, 100] - цвет зеленый
     * 1.4 Если число не входит в диапазон [0, 100] - выводим сообщение, что некорректное
     * <p>
     * PS if\else ветвление (т.е. switch) использовать нельзя.
     * <p>
     * Как работать с цветом: https://stackoverflow.com/questions/5762491/how-to-print-color-in-console-using-system-out-println
     */

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    public static void main(String[] args) {
        System.out.println(ANSI_YELLOW + "green" + ANSI_RESET);
        System.out.println("standard");
        System.out.println(ANSI_RED + "red" + ANSI_RESET);

        printIndicator(24); // красный
        printIndicator(34); // желтый
        printIndicator(74); // желтый
        printIndicator(95); // зеленый
        printIndicator(100); // зеленый

        printIndicator(-5);  // некорректно
        printIndicator(101); // некорректно
    }

    static void printIndicator(int value) {
        // TODO: код вписать тут
        List<ColorInterface> colorsList = Arrays.asList(new Colors(0, 30, ANSI_RED),new Colors(31, 75, ANSI_YELLOW), new Colors(76, 100, ANSI_GREEN));

        ColorSetter colorSetter = new ColorSetter(colorsList);

        System.out.println(colorSetter.SetColor(value) + ANSI_RESET);
    }

}
