
class Solution {

    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}

public class remove_elements {

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = {3, 2, 2, 3};
        int val = 3;
        // int[] nums = {0,1,2,2,3,0,4,2};
        // int val = 2;

        int newLength = solution.removeElement(nums, val);

        System.out.print("Array after removal: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }

        System.out.println("\nNew length: " + newLength);
    }
}
