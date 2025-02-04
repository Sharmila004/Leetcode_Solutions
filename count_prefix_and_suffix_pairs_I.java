
class Solution {

    boolean isPrefixAndSuffix(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        if (len1 > len2) {
            return false;
        }
        for (int i = 0; i < len1; i++) {
            boolean cond1 = str1.charAt(i) != str2.charAt(i);
            boolean cond2 = str1.charAt(len1 - 1 - i) != str2.charAt(len2 - 1 - i);
            if (cond1 || cond2) {
                return false;
            }
        }
        return true;
    }

    public int countPrefixSuffixPairs(String[] words) {
        int len = words.length;
        int count = 0;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                boolean cond1a = i != j && i < j;
                boolean cond1b = words[i].length() <= words[j].length();
                boolean cond1 = cond1a & cond1b;
                boolean cond2 = isPrefixAndSuffix(words[i], words[j]);
                if (cond1 & cond2) {
                    count++;
                }
            }
        }
        return count;
    }
}

public class count_prefix_and_suffix_pairs_I {

    public static void main(String[] args) {
        // String words[] = {"a","aba","ababa","aa"};
        // String words[] = {"pa","papa","ma","mama"};
        String words[] = {"abab", "ab"};
        Solution sol = new Solution();
        System.out.println(sol.countPrefixSuffixPairs(words));
    }
}
