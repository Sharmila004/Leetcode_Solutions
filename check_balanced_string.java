
public class check_balanced_string {

    public static boolean isBalanced(String num) {
        int oddsum = 0;
        int evensum = 0;

        for (int i = 1; i <= num.length(); i++) {
            int digit = Integer.parseInt(String.valueOf(num.charAt(i - 1)));
            if (i % 2 == 0) {
                evensum += digit;
            } else {
                oddsum += digit;
            }
        }
        return evensum == oddsum;
    }

    public static void main(String[] args) {
        // String num = "1234";
        String num = "24123";
        System.out.println(isBalanced(num));
    }
}
