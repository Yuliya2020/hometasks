package MainTask;
import java.util.Scanner;
public class RandomNumbersInString {
    public static void main (String [] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("input integer a");
        int a = in.nextInt();
        System.out.println("input integer b");
        int b = in.nextInt();
        System.out.println("input integer c");
        int c = in.nextInt();
        System.out.println("input integer d");
        int d = in.nextInt();
        System.out.println("input integer e");
        int e = in.nextInt();
        System.out.print (Integer.valueOf(a) + " " + Integer.valueOf(b) + " " + Integer.valueOf(c) + " " + Integer.valueOf(d) + " " + Integer.valueOf(e));

    }
}
