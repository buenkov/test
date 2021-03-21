import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class cookie {
    public static void main(String[] args) {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку для поиска");
        String text = scanner.nextLine();
        Pattern pattern = Pattern.compile("\\ +[sS]+[a-zA-Z]+\\ ");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
//            if (end - start == 4) {
char c='"';
                System.out.println("");
                System.out.println("Найден "+ ++count+" фрагмент\n" + c+ text.substring(start, end)+c + "\nс " + start + " по " + (end - 1)+" символ");
//            }else continue;
        }

    }
}
