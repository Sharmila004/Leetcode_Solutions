
class Solution {

    public String intToRoman(int num) {
        String val = "";
        while (num > 0) {
            if (num >= 1000) {
                val += "M";
                num -= 1000;
            } else if (num >= 900) {
                val += "CM";
                num -= 900;
            } else if (num >= 500) {
                val += "D";
                num -= 500;
            } else if (num >= 400) {
                val += "CD";
                num -= 400;
            } else if (num >= 100) {
                val += "C";
                num -= 100;
            } else if (num >= 90) {
                val += "XC";
                num -= 90;
            } else if (num >= 50) {
                val += "L";
                num -= 50;
            } else if (num >= 40) {
                val += "XL";
                num -= 40;
            } else if (num >= 10) {
                val += "X";
                num -= 10;
            } else if (num >= 9) {
                val += "IX";
                num -= 9;
            } else if (num >= 5) {
                val += "V";
                num -= 5;
            } else if (num >= 4) {
                val += "IV";
                num -= 4;
            } else if (num >= 1) {
                val += "I";
                num -= 1;
            }
        }
        return val;
    }
}

public class integer_to_roman {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int num = 3749;
        // int num = 58;
        // int num = 1994;
        String s = solution.intToRoman(num);
        System.out.println(s);
    }
}
