import java.util.Scanner;

public class Countdown
{
    public static void main(String[] args)
    {
        int[] a = new int[]{1, 7, 3, 4, 5, 6};
        int b = (findMaximum(a, 0));
        System.out.println(b);
    }

    public static String countdown(int number)
    {
       if (number <= 0) {
           return "Blastoff!";
       }
       return number + " " + countdown(number-1);
    }

    public static boolean isPalindrome(String check) {
        if (check.length() <= 1) {
            return true;
        }
        boolean c = check.substring(0,1).equals(check.substring(check.length()-1));
        if (c) {
            check = check.substring(1, check.length()-1);
            return isPalindrome(check);
        }
        return false;
    }

    public static int countEvens(int[] array, int i) {
        if (i >= array.length) {
            return 0;
        }
        if (array[i] % 2 == 0) {
            return 1 + countEvens(array, i+1);
        }
        return countEvens(array, i+1);
    }

    public static int findMaximum(int[] array, int i) {
        if (i >= array.length) {
            return 0;
        }
        int a = array[i];
        if (a > findMaximum(array, i+1)) {
            return a;
        }
        else {
            return findMaximum(array, i+1);
        }
    }



}
