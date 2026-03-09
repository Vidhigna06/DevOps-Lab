public class palin {
    public static void main(String[] args) {
        int num = 121, reverse = 0, remainder, temp;

        temp = num;

        while (num != 0) {
            remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num = num / 10;
        }

        if (temp == reverse)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
