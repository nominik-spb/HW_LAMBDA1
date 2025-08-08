import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);

        // ошибка деления на ноль
        // необходима проверка возможности вычисления
        try {
            int c = calc.devide.apply(a, b);
            calc.println.accept(c);
        } catch (Exception ex) {
            System.out.println("Вычисление невозможно из-за несоответствия одного из параметров (" + a + "/" + b + ")");
        }

        Worker.OnTaskDoneListener listener = System.out::println;
        Worker worker = new Worker(listener);
        worker.start();
    }
}
