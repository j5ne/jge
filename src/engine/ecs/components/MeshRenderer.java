package engine.ecs.components;

import engine.mesh.Mesh;
import engine.utils.Vector2;
import engine.utils.Vector3;

import static org.lwjgl.opengl.GL11.*;

public class MeshRenderer extends Component {

    Mesh mesh;

    public void draw() {
        Vector3 position = Vector3.ZERO;
        Vector3 rotation = Vector3.ZERO;
        if (getNode().hasComponent(Transform.class)) {
            position = getNode().getComponent(Transform.class).position;
            rotation = getNode().getComponent(Transform.class).position;
        }

        mesh.draw(position, rotation);
    }

    public MeshRenderer(Mesh mesh) {
        this.mesh = mesh;
    }
}
