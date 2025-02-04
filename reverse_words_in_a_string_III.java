
public class reverse_words_in_a_string_III {

    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            String reversedWord = new StringBuilder(word).reverse().toString();
            result.append(reversedWord).append(" ");
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        String s1 = "Let's take LeetCode contest";
        String s2 = "Mr Ding";
        System.out.println(reverseWords(s1));
        System.out.println(reverseWords(s2));

    }
}
