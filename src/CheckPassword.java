import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckPassword {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String EnteredDate;

        //Блок паттернов - или же отдельные условия
        String pattern = "[0-9]{1,}"; //Сколько чисел должно быть
        Pattern p1 = Pattern.compile(pattern);
        pattern = "[a-z]{1,}"; //Сколько букв с нижним регистром должно быть
        Pattern p2 = Pattern.compile(pattern);
        pattern = "[A-Z]{1,}"; //Сколько букв с вехним регистром должно быть
        Pattern p3 = Pattern.compile(pattern);
        pattern = "[.]{8,}"; //Сколько минимум дожно быть символов
        Pattern p4 = Pattern.compile(pattern);
        pattern = "[^a-zA-Z0-9_]"; //Запреты на все кроме разрешенного
        Pattern p5 = Pattern.compile(pattern);

        while (true) {
            EnteredDate = new String(in.nextLine());
            Matcher m1 = p1.matcher(EnteredDate);
            Matcher m2 = p2.matcher(EnteredDate);
            Matcher m3 = p3.matcher(EnteredDate);
            Matcher m4 = p4.matcher(EnteredDate);
            Matcher m5 = p5.matcher(EnteredDate);

            if (m5.find()) {
                System.out.println("Password contains wrong symbols, try again");
                continue;
            }

            if (m1.find()&& m2.find() && m3.find() && m4.find()) {
                System.out.println("Password is safe");
                break;
            }
            else {
                System.out.println("Password is unsafe, try again");
            }
        }


    }

}



//System.out.println(m1.find()&& m2.find() && m3.find() && m4.find());