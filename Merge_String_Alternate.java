
class Merge_String_Alternate {

    public static String MergeAlternately(String word1, String word2) {
        String merged = "";
        int max = Math.max(word1.length(), word2.length());
        for (int i = 0; i < max; i++) {
            if (i < word1.length()) {
                merged += word1.charAt(i);
            }
            if (i < word2.length()) {
                merged += word2.charAt(i);
            }
        }
        return merged;
    }

    public static void main(String[] args) {
        // String word1 = "abc"; 
        // String word2 = "pqr";
        // String word1 = "ab"; 
        // String word2 = "pqrs";
        String word1 = "abcd";
        String word2 = "pq";
        String result = MergeAlternately(word1, word2);
        System.out.println(result);
    }
}
