package com.leetcode.medium;

import java.util.Stack;

public class ConvertBSTtoGreaterTree_538 {

	public static void main(String[] args) {
		
	}
	
	
	public TreeNode convertBST(TreeNode root) {
        int sum = 0;
        TreeNode node = root;
        Stack<TreeNode> stack = new Stack<>();

        while (!stack.isEmpty() || node != null) {
            /* push all nodes up to (and including) this subtree's maximum on the stack. */
            while (node != null) {
                stack.add(node);
                node = node.right;
            }

            node = stack.pop();
            sum += node.val;
            node.val = sum;

            /* all nodes with values between the current and its parent lie in the left subtree. */
            node = node.left;
        }

        return root;
    }

}
