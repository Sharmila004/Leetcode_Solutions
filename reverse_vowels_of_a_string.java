
class Solution {

    public String reverseVowels(String s) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        char[] letters = s.toCharArray();
        int[] vowelIndices = new int[s.length()];
        char[] vowelLetters = new char[s.length()];
        int vowelCount = 0;
        for (int i = 0; i < letters.length; i++) {
            for (char vowel : vowels) {
                if (letters[i] == vowel) {
                    vowelIndices[vowelCount] = i;
                    vowelLetters[vowelCount] = letters[i];
                    vowelCount++;
                    break;
                }
            }
        }
        for (int i = 0; i < vowelCount; i++) {
            letters[vowelIndices[i]] = vowelLetters[vowelCount - 1 - i];
        }
        return new String(letters);
    }
}

public class reverse_vowels_of_a_string {

    public static void main(String[] args) {
        Solution solution = new Solution();

        String s = "IceCreAm";
        String reversed_s = solution.reverseVowels(s);

        System.out.println(reversed_s);
    }
}
