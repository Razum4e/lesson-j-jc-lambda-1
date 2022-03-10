package lessons.javaCore.lambda1;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = Calculator.instance.get();
        int a = calculator.plus.apply(1, 2);
        int b = calculator.minus.apply(1, 1);
        int c = calculator.divide.apply(a, b);
        calculator.println.accept(c);
        /* ошибка появлялась в связи с тем, что операция на ноль невозможна
        * поэтому можно:
        * 1) мой вариант - выбросить исключение;
        * 2) вывести в "sout" сообщение об ошибке через try/catch и return какое либо число например "0" */
    }
}
