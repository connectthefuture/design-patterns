package xyz.pinaki.designpattern.examples.structural.bridge;

/**
 * Created by pinaki on 5/14/17.
 */
/* package */ class ExpressionTree {
    private final Node node;
    ExpressionTree(Node n) {
        node = n;
    }

    ExpressionTree left() {
        return new ExpressionTree(node.left());
    }

    ExpressionTree right() {
        return new ExpressionTree(node.left());
    }

    int data() {
        return node.data();
    }

    boolean isNull() {
        return node == null;
    }
}
