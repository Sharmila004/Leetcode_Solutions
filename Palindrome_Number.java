
class Palindrome_Number {

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        } else {
            String originalx = String.valueOf(x);
            String reversedx = "";
            for (int i = originalx.length() - 1; i >= 0; i--) {
                reversedx += originalx.charAt(i);
            }
            return reversedx.equals(originalx);
        }
    }

    public static void main(String[] args) {
        // int x = 121;
        // int x = -121;
        int x = 10;
        System.out.println(isPalindrome(x));
    }
}
