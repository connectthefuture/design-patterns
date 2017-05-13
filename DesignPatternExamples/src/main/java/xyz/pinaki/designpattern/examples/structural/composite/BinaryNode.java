package xyz.pinaki.designpattern.examples.structural.composite;

/**
 * Created by pinaki on 5/12/17.
 */
public class BinaryNode extends UnaryNode {
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
