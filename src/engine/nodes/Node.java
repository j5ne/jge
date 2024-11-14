package engine.nodes;

import engine.ecs.components.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Node {
    public Node parent;
    private List<Node> children = new ArrayList<>();

    private Map<Class<? extends Component>, Component> components = new HashMap<>();

    public <T extends Component> void addComponent(T component) {
        component._setNode(this);
        components.put(component.getClass(), component);
    }

    public <T extends Component> T getComponent(Class<T> componentClass) {
        return componentClass.cast(components.get(componentClass));
    }

    public Map<Class<? extends Component>, Component> getComponents(){
        return components;
    }

    public <T extends Component> boolean hasComponent(Class<T> componentClass) {
        return components.containsKey(componentClass);
    }

    public <T extends Component> void removeComponent(Class<T> componentClass) {
        components.remove(componentClass);
    }


    public List<Node> getChildren() {
        return children;
    }

    public List<Node> getDescendants() {
        List<Node> descendants = new ArrayList<>();
        for (Node child : children) {
            descendants.add(child);
            descendants.addAll(child.getDescendants());
        }
        return descendants;
    }

    public void addChild(Node child) {
        child.parent = this;
        children.add(child);
    }
}
