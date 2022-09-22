class Tree {
    int val;
    Tree left;
    Tree right;
}
public class InvertedTrees{
    public boolean solve(Tree source, Tree target) {
        if (target == null)
            return source == target;
        return check(source, target) || solve(source, target.left) || solve(source, target.right);
    }

    public boolean check(Tree s, Tree t) {
        if (s == null || t == null)
            return s == t;
        if (s.val != t.val)
            return false;
        return check(s.left, t.right) && check(s.right, t.left)
            || check(s.left, t.left) && check(s.right, t.right);
    }
}