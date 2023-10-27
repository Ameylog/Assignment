import java.util.Scanner;

public class RomanToInteger {
    static int value(char ch) {
        if (ch == 'I') {
            return 1;
        }
        if (ch == 'V') {
            return 5;
        }
        if (ch == 'X') {
            return 10;
        }
        if (ch == 'L') {
            return 50;
        }
        if (ch == 'C') {
            return 100;
        }
        if (ch == 'D') {
            return 500;
        }
        if (ch == 'M') {
            return 1000;
        }
        return -1;
    }

    private static int romanToInteger(String romanString) {

        if(romanString==null || romanString.isEmpty()){
            return 0;
        }

        int total = 0;
        for (int i = 0; i < romanString.length(); i++) {
            int num1 = value(romanString.charAt(i));

            if (i + 1 < romanString.length()) {
                int num2 = value(romanString.charAt(i + 1));

                if (num1 >= num2) {
                    total = total + num1;
                } else {
                    total = total - num1;
                }
            }else{
                total=total+num1;
            }
        }
        return total;

    }

    public static void main(String[] args) {
        System.out.print("Enter the Capital Roman letter :- ");
        Scanner sc = new Scanner(System.in);
        String romanString = sc.next();

        System.out.println("Roman To Integer is:- "+romanToInteger(romanString));
    }


}
