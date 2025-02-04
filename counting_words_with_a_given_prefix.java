
class Solution {

    public int prefixCount(String[] words, String pref) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].startsWith(pref)) {
                count += 1;
            }
        }
        return count;
    }
}

public class counting_words_with_a_given_prefix {

    public static void main(String[] args) {
        // String words[] = {"pay","attention","practice","attend"};
        // String pref = "at";
        String words[] = {"leetcode", "win", "loops", "success"};
        String pref = "code";
        Solution solution = new Solution();
        System.out.println(solution.prefixCount(words, pref));
    }
}
