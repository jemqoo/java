import java.math.*;
import java.util.Scanner;

/*
Вариант 9
Если все единицы:
f(0, b) = 1
Если один ноль, остальные единицы:
f(1, b) = b + 1
Если больше одного нуля и нет единиц:
f(>1, 0) = 0
Иначе либо последняя цифра - ноль, тогда предпоследняя - единица; либо последняя - единица.
f(a, b) = f(a - 1, b - 1) + f(a, b - 1)
 */
public class Prakt5 {

    public static void main(String[] args) {
        System.out.println(SumNumeric(23753285));
        System.out.println(isPalindrome("asdfghhgfsa"));
        System.out.println("Количество последовательностей, в которых никакие два нуля не стоят рядом: " + count(3,5));
    }

    public static long SumNumeric(long N) {
        if (N / 10 != 0) {
            return N % 10 + SumNumeric(N / 10);
        } else {
            return N % 10;
        }
    }

    public static boolean isPalindrome(String str) {
        if (str.length() == 1) {
            return true;
        } else if (str.substring(0, 1).equals(str.substring(str.length() - 1, str.length()))) {
            if (str.length() == 2) {
                return true;
            } else {
                return isPalindrome(str.substring(0, str.length() - 1));
            }
        } else {
            return false;
        }
    }

    public static int count(int a, int b)
    {
        if (a==0) return 1;
        if (a==1) return b+1;
        if (a>1 && b == 0) return 0;
        return count(a-1,b-1)+count(a,b-1);
    }
}
