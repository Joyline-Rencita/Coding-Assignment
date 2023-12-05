import java.util.Scanner;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0)
            return null;

        TreeNode head = helper(nums, 0, nums.length - 1);

        return head;
    }

    public TreeNode helper(int[] nums, int low, int high) {
        if (low > high)
            return null;

        int mid = (low + high) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = helper(nums, low, mid - 1);
        node.right = helper(nums, mid + 1, high);

        return node;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the sorted array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        Solution solution = new Solution();
        TreeNode result = solution.sortedArrayToBST(nums);
        System.out.println("Balanced BST has been created.");

        scanner.close();
    }
}

