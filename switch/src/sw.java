import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class sw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isCorrectName = false;
        System.out.println("Введите мобильный номер телефона");
        while (!isCorrectName) {
            String name = scanner.nextLine();
            isCorrectName = checkName(name);
            if (!isCorrectName) System.out.println("Длина номера некорректна, введите корректный номер!");
            else System.out.println("номер корректный");

        }
    }

    public static boolean checkName(String name) {
        String nomer = name.trim();
        nomer = nomer.replace("(", "");
        nomer = nomer.replace(")", "");
        nomer = nomer.replace("+", "");
        nomer = nomer.replace(" ", "");
        nomer = nomer.replace("-", "");
        boolean b = true;
        for (int i = 0; i < nomer.length(); i++) {
            b = b && ((nomer.charAt(i) == '0') || (nomer.charAt(i) == '1') || (nomer.charAt(i) == '2') || (nomer.charAt(i) == '3') || (nomer.charAt(i) == '4') || (nomer.charAt(i) == '5') || (nomer.charAt(i) == '6') || (nomer.charAt(i) == '7') || (nomer.charAt(i) == '8') || (nomer.charAt(i) == '9'));
                    }
        if (b == false) {
            System.out.println("Введите числа от 0 до 9");
            return b;
        } else if (nomer.charAt(0) == '9') {
            System.out.println("+7" + nomer);
            return nomer.length() == 10;
        } else {
            System.out.println("+7" + nomer.substring(1));
            return nomer.length() == 11;
        }
    }

//    private static String CorrName(String name) {
//        String[] stemp = name.trim().split(" ");
//        String result="";
//        char ch = ' ';
//        for (int i = 0; i < stemp.length; i++) {
//            stemp[i]=stemp[i].toLowerCase(Locale.ROOT);
//            ch = Character.toUpperCase(stemp[i].charAt(0));
//            result+= ch+stemp[i].substring(1)+" ";
//        }
//
//        return result;
//    }
//    private static String Sorter(String name) {
//        String[] strsort = name.trim().split(" ");
//        String temp,result="";
//        for (int out=strsort.length-1 ;out>=1;out--){
//            for (int in=0; in<out;in++){
//                if (strsort[in].length()>strsort[in+1].length()){
//                    temp=strsort[in];
//                    strsort[in]=strsort[in+1];
//                    strsort[in+1]=temp;
//                }
//            }
//        }
//        for (int i = 0; i < strsort.length; i++) {
//            result+= strsort[i]+" ";
//        }
//        return result;
//    }
}