package algorithm.easy;

import java.awt.desktop.PreferencesEvent;
import java.util.Scanner;

/**
 * Description of file goes here
 *
 * @author Ali Sadeghi
 * Created at 2023/08/11 - 7:01 PM
 */
public class ReverseNumber {

    /*public static void main(String[] args) {
        int reverse = new ReverseNumber().reverse(123);
        System.out.println("reverse = " + reverse);
    }*/

    public int reverse(int x) {
        if (x < 10) return x;
        return (x % 10) * 10 + reverse(x / 10);
    }

    public static void reverseNumber(int number) {
        if (number < 10) {
//prints the same number if the number is less than 10
            System.out.println(number);
            return;
        } else {
            System.out.print(number % 10);
            reverseNumber(number / 10);
        }
    }

    public static void main(String args[]) {
        System.out.print("Enter the number that you want to reverse: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print("The reverse of the given number is: ");
//method calling
        reverseNumber(num);
    }
}
