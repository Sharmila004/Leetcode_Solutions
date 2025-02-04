
class Solution {

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}

public class remove_duplicates_from_sortedArray {

    public static void main(String[] args) {
        Solution solution = new Solution();

        // int[] nums = {1,1,2};
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        int newLength = solution.removeDuplicates(nums);

        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.println(newLength);
    }
}
