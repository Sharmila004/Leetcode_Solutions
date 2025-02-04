
import java.util.ArrayList;
import java.util.List;

class kids_with_greatest_number_of_candies {

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            int temp = candies[i] + extraCandies;
            boolean val = true;
            for (int num : candies) {
                if (temp < num) {
                    val = false;
                    break;
                }
            }
            result.add(val);
        }
        return result;
    }

    public static void main(String[] args) {
        // int[] candies = {2, 3, 5, 1, 3};
        // int extraCandies = 3;
        // int[] candies = {4, 2, 1, 1, 2};
        // int extraCandies = 1;
        int[] candies = {12, 1, 12};
        int extraCandies = 10;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }
}
