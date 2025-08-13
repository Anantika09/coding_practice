/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        // Map: col -> Map: row -> PriorityQueue of values
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();

        // BFS queue: store node with its col and row
        Queue<Tuple> q = new LinkedList<>();
        q.offer(new Tuple(root, 0, 0));

        while (!q.isEmpty()) {
            Tuple t = q.poll();
            TreeNode node = t.node;
            int col = t.col;
            int row = t.row;

            map.putIfAbsent(col, new TreeMap<>());
            map.get(col).putIfAbsent(row, new PriorityQueue<>());
            map.get(col).get(row).offer(node.val);

            if (node.left != null) {
                q.offer(new Tuple(node.left, col - 1, row + 1));
            }
            if (node.right != null) {
                q.offer(new Tuple(node.right, col + 1, row + 1));
            }
        }

        List<List<Integer>> res = new ArrayList<>();
        for (TreeMap<Integer, PriorityQueue<Integer>> rows : map.values()) {
            List<Integer> colList = new ArrayList<>();
            for (PriorityQueue<Integer> pq : rows.values()) {
                while (!pq.isEmpty()) {
                    colList.add(pq.poll());
                }
            }
            res.add(colList);
        }

        return res;
    }

    static class Tuple {
        TreeNode node;
        int col;
        int row;
        Tuple(TreeNode n, int c, int r) {
            node = n;
            col = c;
            row = r;
        }
    }
}
