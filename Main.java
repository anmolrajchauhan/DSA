import utils.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(3);
        root.setLeft(new TreeNode(9));
        root.setRight(new TreeNode(20));
        root.getRight().setLeft(new TreeNode(15));
        root.getRight().setRight(new TreeNode(7));

        List<List<Integer>> result = new ArrayList<>();
        if(root == null) System.out.println(result);

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
        System.out.println(result);


    }

}
