import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);

        // ошибка деления на ноль
        // необходима проверка переменной b на равенство 0
        try {
            int c = calc.devide.apply(a, b);
            calc.println.accept(c);
        } catch (Exception ex) {
            System.out.println("Вычисление невозможно, т.к. деление на ноль");
        }
    }
}
