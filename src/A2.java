
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pistm9061
 */
public class A2 {

    // problem 1
    public int digitalSum(int n) {
        // base case
        if (n < 10) {
            return n;
        } else {
            // calculate the sum
            int l = n / 10;
            int r = n % 10;
            // return the calculated sum
            return digitalSum(l) + r;
        }
    }

    // problem 2
    public int digitalRoot(int n) {
        // base case
        if (n < 10) {
            return n;
        } else {
            // calculate the root
            int l = n / 10;
            int r = n % 10;
            //return calculated root
            return digitalRoot(l + r);
        }
    }

    //problem 3
    public int triangle(int n) {
        int a = 0;
        // base case
        if (n == 0) {
            return n;
        } else {
            // find the amount in the given row
            a = a + n;
            a = a + triangle(n - 1);
        }
        return a;
    }

    //problem 4
    public String hailstone(int n) {
        String h = "" + n;
        // make sure the number is above zero
        if (n <= 0) {
            System.out.println("Please enter a number above zero");
        }
        // base case
        if (n != 1) {
            // if the number is even, then divide by two
            if (n % 2 == 0) {
                return h + " " + hailstone(n / 2);
            } else {
                // if the number is odd, then multiply by three and add one
                return h + " " + hailstone(3 * n + 1);
            }
        } else {
            return h;
        }
    }

    // problem 5
    public String binaryConvert(int n) {
        // make integer a string
        String b = "" + n;
        // make sure integer is above 0
        if (n <= 0) {
            System.out.println("Please enter a number above zero");
        }
        //base case
        if (n == 1) {
            return b;
        } else {
            // if number is odd
            if (n % 2 != 0) {
                //return 1 and divide n by two
                return binaryConvert(n / 2) + "1";
            } else {
                // if number is even
                // return 0 and divide n by two
                return binaryConvert(n / 2) + "0";
            }
        }
    }

    //problem 6
    public String convert(int n, int b) {
        // the quotient of n
        int q = n / b;
        // remainder of n when it's divided by b
        int r = n % b;
        // base case
        if (q == 0) {
            // convert the remainder to a string
            return Integer.toString(r);
        } else {
            // method + remainder
            return convert(q, b) + Integer.toString(r);
        }
    }

    // problem 7
    public boolean isPalindrome(String s) {
        // base case
        // return "true" if the length is less than or equal to one
        if (s.length() == 0 || s.length() == 1) {
            return true;
        }
        // check if first character is the same as the last character
        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            // now check every character
            return isPalindrome(s.substring(1, s.length() - 1));
        }
        // if there is no palindrome return "false"
        return false;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A2 test = new A2();
        // problem 1 test for method
        int bound1 = test.digitalSum(25);
        System.out.println("sum of digits(25): " + bound1);
        int bound2 = test.digitalSum(168);
        System.out.println("sum of digits(168): " + bound2);
        int bound3 = test.digitalSum(76);
        System.out.println("sum of digits(76): " + bound3);

        //problem 2 test for method
        int bound4 = test.digitalRoot(25);
        System.out.println("digital root(25): " + bound4);
        int bound5 = test.digitalRoot(64);
        System.out.println("digital root(64): " + bound5);
        int bound6 = test.digitalRoot(121);
        System.out.println("digital root(121): " + bound6);

        //problem 3 test for method
        int bound7 = test.triangle(3);
        System.out.println("triangle(3): " + bound7);
        int bound8 = test.triangle(7);
        System.out.println("triangle(7): " + bound8);
        int bound9 = test.triangle(5);
        System.out.println("triangle(5): " + bound9);

        //problem 4 test for method
        String bound10 = test.hailstone(2);
        System.out.println("hailstone(3): " + bound10);
        String bound11 = test.hailstone(7);
        System.out.println("hailstone(7): " + bound11);
        String bound12 = test.hailstone(4);
        System.out.println("hailstone(4): " + bound12);

        // problem 5 test for method
        String bound13 = test.binaryConvert(146);
        System.out.println("binaryConvert(3): " + bound13);
        String bound14 = test.binaryConvert(58);
        System.out.println("binaryConvert(7): " + bound14);
        String bound15 = test.binaryConvert(7);
        System.out.println("binaryConvert(4): " + bound15);

        //problem 6 test for method
        String bound16 = test.convert(16, 3);
        System.out.println("convert(16,3): " + bound16);
        String bound17 = test.convert(5, 10);
        System.out.println("convert(5,10): " + bound17);
        String bound18 = test.convert(18, 6);
        System.out.println("convert(18,6): " + bound18);

        // problem 7 test for method
        Boolean bound19 = test.isPalindrome("racecar");
        System.out.println("racecar : " + bound19);
        Boolean bound20 = test.isPalindrome("hello");
        System.out.println("hello : " + bound20);
        Boolean bound21 = test.isPalindrome("stanley yelnats");
        System.out.println("stanley yelnats : " + bound21);





    }
}
