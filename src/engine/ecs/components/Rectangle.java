package engine.ecs.components;

import engine.utils.Rect2;
import engine.utils.Vector3;

import static org.lwjgl.opengl.GL11.*;

public class Rectangle extends Component {
    Rect2 rectangle = Rect2.ZERO;

    public void draw() {
        Vector3 offset = Vector3.ZERO;
        if (getNode().hasComponent(Transform.class)) {
            offset = getNode().getComponent(Transform.class).position;
        }
        glBegin(GL_QUADS);
        glVertex3f(-0.5f + offset.x, -0.5f + offset.y, 0f + offset.z);
        glVertex3f(0.5f + offset.x, -0.5f + offset.y, 0f + offset.z);
        glVertex3f(0.5f + offset.x, 0.5f + offset.y, 0f + offset.z);
        glVertex3f(-0.5f + offset.x, 0.5f + offset.y, 0f + offset.z);
        glEnd();
    }
}
