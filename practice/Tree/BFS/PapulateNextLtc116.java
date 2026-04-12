package Tree;

public class PapulateNextLtc116 extends TreeNode {
    public static Node connect(Node root) {
        if (root == null) return root;
        Node leftMost = root;
        while (leftMost.left != null) {
            /*
             * this works becz bt is always balance means if there is no left
             * child means there will be no right element as well
             * */
            Node cNode = leftMost;
            while (cNode != null) {
                /*
                 * only this video 5 min of clip can explain this
                 * https://youtu.be/9D-vP-jcc-Y?list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ&t=3800*/
                cNode.left.next = cNode.right;
                if (cNode.next != null) {
                    cNode.right.next = cNode.next.left;
                }
                cNode = cNode.next;
            }
            leftMost = leftMost.left;
        }
        return root;
    }
}
