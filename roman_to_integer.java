
class Solution {

    public int romanToInt(String s) {
        int val = 0;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'I' ->
                    val += 1;
                case 'V' -> {
                    if (i > 0 && s.charAt(i - 1) == 'I') {
                        val += 3;
                    } else {
                        val += 5;
                    }
                }
                case 'X' -> {
                    if (i > 0 && s.charAt(i - 1) == 'I') {
                        val += 8;
                    } else {
                        val += 10;
                    }
                }
                case 'L' -> {
                    if (i > 0 && s.charAt(i - 1) == 'X') {
                        val += 30;
                    } else {
                        val += 50;
                    }
                }
                case 'C' -> {
                    if (i > 0 && s.charAt(i - 1) == 'X') {
                        val += 80;
                    } else {
                        val += 100;
                    }
                }
                case 'D' -> {
                    if (i > 0 && s.charAt(i - 1) == 'C') {
                        val += 300;
                    } else {
                        val += 500;
                    }
                }
                case 'M' -> {
                    if (i > 0 && s.charAt(i - 1) == 'C') {
                        val += 800;
                    } else {
                        val += 1000;
                    }
                }
                default -> {
                }
            }
        }
        return val;
    }
}

public class roman_to_integer {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "III";
        // String s = "LVIII";
        // String s = "MCMXCIV";
        int val = solution.romanToInt(s);
        System.out.println(val);
    }
}
