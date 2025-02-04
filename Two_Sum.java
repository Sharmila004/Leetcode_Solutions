
class Two_Sum {

    public static int[] TwoSum(int[] nums, int target) {
        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int sum = nums[i] + nums[j];
                if (sum == target && i != j) {
                    index1 = i;
                    index2 = j;
                    break;
                }
            }
        }
        int[] solution = {index1, index2};
        return solution;
    }

    public static void main(String[] args) {
        // int[] nums = {2, 7, 11, 15};
        // int target = 9;
        // int[] nums = {3,2,4};
        // int target = 6;
        int[] nums = {3, 3};
        int target = 6;
        int[] result = TwoSum(nums, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}
