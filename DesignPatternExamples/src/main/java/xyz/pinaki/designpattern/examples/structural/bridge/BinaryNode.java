package xyz.pinaki.designpattern.examples.structural.bridge;

/**
 * Created by pinaki on 5/12/17.
 */
/* package */ class BinaryNode extends UnaryNode {
    Node left;

    BinaryNode(Node l, Node r) {
        super(r);
        left = l;
    }

    @Override
    Node left() {
        return left;
    }
}
