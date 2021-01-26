import java.util.*;
import java.util.EmptyStackException;

public class StackNumberReverse  {
    public static void main( String[] args) throws EmptyStackException {
    Scanner in = new Scanner(System.in);
        System.out.println("input an integer number having several figures");
    int inputNumber = in.nextInt();
    String figure = String.valueOf(inputNumber);
        Stack<Character> stackNumberReverse = new Stack<>();
        int numberofStackElements = 100;
        for ( int i=0; i<=figure.length()-1; i++){
        char character = figure.charAt(i);
        stackNumberReverse.push(character);}
            for (int k = 0; k <= numberofStackElements; k++) {
                try {
                    char figureOut;
                    figureOut = stackNumberReverse.pop();
                    System.out.print(figureOut);
                    } catch (EmptyStackException e) {
                }
             }}}
