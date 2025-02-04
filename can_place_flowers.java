
class Solution {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                Boolean leftcondition = (i == 0) || (flowerbed[i - 1] == 0);
                Boolean rightcondition = (i == flowerbed.length - 1) || (flowerbed[i + 1] == 0);
                if (leftcondition && rightcondition) {
                    flowerbed[i] = 1;
                    n -= 1;
                }
            }
        }
        Boolean result = false;
        if (n <= 0) {
            result = true;
        }
        return result;
    }
}

public class can_place_flowers {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] flowerbed = {1, 0, 0, 0, 1};
        int n = 1;
        // int[] flowerbed = {1, 0, 0, 0, 1};
        // int n = 2;
        boolean canPlace = solution.canPlaceFlowers(flowerbed, n);
        System.out.println(canPlace);
    }
}
