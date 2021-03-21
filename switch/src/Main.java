import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 1-ый операнд");
        int operand1 = scanner.nextInt();
        char operation = '+';
        while (operation != 's') {
            System.out.println("введите действие");
            operation = scanner.next().charAt(0);
            if (operation == 's') {
                System.out.println("Выключаюсь");
                break;
            } else if (operation == 'c' || operation == 'C') {
                operand1 = 0;
                System.out.println(operand1);
                continue;
            }
            System.out.println("введите следующий операнд");
            int operand2 = scanner.nextInt();
            System.out.print("Значение = ");
            System.out.println(operand1 = calculate(operand1, operation, operand2));
        }
    }

    private static int calculate(int a, char c, int b) {
        int result = 0;
        switch (c) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '/':
                result = a / b;
                break;
            case '*':
                result = a * b;
                break;
            default:
                result = a;
                System.out.println("Неверно введена операция");
        }
        return result;
    }
}