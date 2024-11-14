package engine.nodes;

import engine.ecs.components.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Node {
    public Node parent;
    private List<Node> children;

    public List<Node> getChildren() {
        return children;
    }

    public void addChild(Node child) {
        children.add(child);
    }
}
