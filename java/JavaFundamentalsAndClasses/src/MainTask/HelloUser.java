package MainTask;
import java.util.Scanner;
public class HelloUser {
public static void main (String [] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("input user name");
   String userName = in.next();
   System.out.println("Hello, " + userName + "!");
}
}
