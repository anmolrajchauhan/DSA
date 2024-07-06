package Medium;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigZagLevelOrderTraversal {

//    Given the root of a binary tree, return the zigzag level order traversal of its nodes' values. (i.e., from left to right, then right to left for the next level and alternate between).
//
//
//    Example 1:
//    Input: root = [3,9,20,null,null,15,7]
//    Output: [[3],[20,9],[15,7]]
//
//    Example 2:
//    Input: root = [1]
//    Output: [[1]]
//
//    Example 3:
//    Input: root = []
//    Output: []
//
//
//    Constraints:
//    The number of nodes in the tree is in the range [0, 2000].
//    -100 <= Node.val <= 100

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean leftToRight = true;

        while(!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                if(node.getLeft() != null) queue.add(node.getLeft());
                if(node.getRight() != null) queue.add(node.getRight());
                list.add(node.getVal());
            }
            if(!leftToRight) Collections.reverse(list);
            result.add(list);
            leftToRight = !leftToRight;
        }

        return result;

    }
}
