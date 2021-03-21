package example;

import java.util.Locale;
import java.util.Scanner;

public class Exmp {
    public static void main(String[] args) {
        exprint exprint = new exprint();
                Scanner scanner = new Scanner(System.in);
        boolean isCorrectName = false;
        while (!isCorrectName) {
            String name = scanner.nextLine();
            isCorrectName = checkName(name);
            if (!isCorrectName) System.out.println("Введите корректное имя!");
            else System.out.println(Sorter(CorrName(name)));

        }
    }

    public static boolean checkName(String name) {
        String[] words = name.trim().split(" ");
        return words.length == 3;

    }

    private static String CorrName(String name) {
        String[] stemp = name.trim().split(" ");
        String result = "";
        char ch = ' ';
        for (int i = 0; i < stemp.length; i++) {
            stemp[i] = stemp[i].toLowerCase(Locale.ROOT);
            ch = Character.toUpperCase(stemp[i].charAt(0));
            result += ch + stemp[i].substring(1) + " ";
        }

        return result;
    }

    private static String Sorter(String name) {
        String[] strsort = name.trim().split(" ");
        String temp, result = "";
        for (int out = strsort.length - 1; out >= 1; out--) {
            for (int in = 0; in < out; in++) {
                if (strsort[in].length() > strsort[in + 1].length()) {
                    temp = strsort[in];
                    strsort[in] = strsort[in + 1];
                    strsort[in + 1] = temp;
                }
            }
        }
        for (int i = 0; i < strsort.length; i++) {
            result += strsort[i] + " ";
        }
        return result;
    }
}