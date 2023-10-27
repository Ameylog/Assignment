import java.util.Scanner;

public class Panagram {

    public static boolean checkPanagram(String s) {

        boolean[] check = new boolean[26];
        int index = 0;

        for (int i = 0; i < s.length(); i++) {

            if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z')
                index = s.charAt(i) - 'A';
            else if ('a' <= s.charAt(i) && s.charAt(i) <= 'z')
                index = s.charAt(i) - 'a';
            else
                continue;
            check[index] = true;
        }
        for (int i = 0; i <=25; i++) {
            if (check[i] == false)
                return (false);
        }
        return (true);
    }

    public static void main(String[] args) {
        System.out.println("Enter the String:- ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        if (checkPanagram(s) == true) {
            System.out.println("The give String is panagram ");
        } else {
            System.out.println("The give String is not panagram");
        }
    }

}
