package engine.ecs.components;

import engine.nodes.Node;

public class Component {
    private Node node;

    public Node getNode() {
        return node;
    }

    public void _setNode(Node node) {
        this.node = node;
    }

    public void draw() {}
    public void init() {}
}
