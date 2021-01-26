package OptionalTask1JavaFundamentals;
import java.util.Scanner;

public class IntegersLength {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("input integer n-4");
        int a = in.nextInt();
        String str1 = Integer.toString(a);
        System.out.println("input integer n-3");
        int b = in.nextInt();
        String str2 = Integer.toString(b);
        System.out.println("input integer n-2");
        int c = in.nextInt();
        String str3 = Integer.toString(c);
        System.out.println("input integer n-1");
        int d = in.nextInt();
        String str4 = Integer.toString(d);
        System.out.println("input integer n");
        int e = in.nextInt();
        String str5 = Integer.toString(e);
        int minimum1 = Math.min(str1.length(), str2.length());
        int minimum2 = Math.min(minimum1, str3.length());
        int minimum3 = Math.min(minimum2, str4.length());
        int minimum = Math.min(minimum3, str5.length());
        int maximum1 = Math.max(str1.length(), str2.length());
        int maximum2 = Math.max(maximum1, str3.length());
        int maximum3 = Math.max(maximum2, str4.length());
        int maximum = Math.max(maximum3, str5.length());
        if (minimum == maximum) {
            System.out.println("the lengths of all integers are equal");}
        else {
        System.out.println("minimum length = " + minimum);
        if (str1.length() == minimum) {
            System.out.println("integer n-4 (" + a + ") has minimum length (" + minimum + ")");
        } else {
        }
        if (str2.length() == minimum) {
            System.out.println("integer n-3 (" + b + ") has minimum length (" + minimum + ")");
        } else {
        }
        if (str3.length() == minimum) {
            System.out.println("integer n-2 (" + c + ") has minimum length (" + minimum + ")");
        } else {
        }
        if (str4.length() == minimum) {
            System.out.println("integer n-1 (" + d + ") has minimum length (" + minimum + ")");
        } else {
        }
        if (str5.length() == minimum) {
            System.out.println("integer n (" + e + ") has minimum length (" + minimum + ")");
        } else {
        }
        System.out.println("maximum length = " + maximum);
        if (str1.length() == maximum) {
            System.out.println("integer n-4 (" + a + ") has maximum length (" + maximum + ")");
        } else {
        }
        if (str2.length() == maximum) {
            System.out.println("integer n-3 (" + b + ") has maximum length (" + maximum + ")");
        } else {
        }
        if (str3.length() == maximum) {
            System.out.println("integer n-2 (" + c + ") has maximum length (" + maximum + ")");
        } else {
        }
        if (str4.length() == maximum) {
            System.out.println("integer n-1 (" + d + ") has maximum length (" + maximum + ")");
        } else {
        }
        if (str5.length() == maximum) {
            System.out.println("integer n (" + e + ") has maximum length (" + maximum + ")");
        } else {
        }
        int averageLength = (maximum+minimum)/2;
        if (str1.length() < averageLength) {
            System.out.println("integer n-4 (" + a + ") has length (" + str1.length() + ") below average");
        } else {
        }
        if (str2.length() < averageLength) {
            System.out.println("integer n-3 (" + b + ") has length (" + str2.length() + ") below average");
        } else {
        }
        if (str3.length() < averageLength) {
            System.out.println("integer n-2 (" + c + ") has length (" + str3.length() + ") below average");
        } else {
        }
        if (str4.length() < averageLength) {
            System.out.println("integer n-1 (" + d + ") has length (" + str4.length() + ") below average");
        } else {
        }
        if (str5.length() < averageLength) {
            System.out.println("integer n (" + e + ") has length (" + str5.length() + ") below average");
        } else {
        }
                if (str1.length() > averageLength) {
            System.out.println("integer n-4 (" + a + ") has length (" + str1.length() + ") above average");
        } else {
        }
        if (str2.length() > averageLength) {
            System.out.println("integer n-3 (" + b + ") has length (" + str2.length() + ") above average");
        } else {
        }
        if (str3.length() > averageLength) {
            System.out.println("integer n-2 (" + c + ") has length (" + str3.length() + ") above average");
        } else {
        }
        if (str4.length() > averageLength) {
            System.out.println("integer n-1 (" + d + ") has length (" + str4.length() + ") above average");
        } else {
        }
        if (str5.length() > averageLength) {
            System.out.println("integer n (" + e + ") has length (" + str5.length() + ") above average");
        } else {
        }
        }
    }
}

