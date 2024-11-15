package engine.ecs.components;

import engine.utils.Rect2;
import engine.utils.Vector2;
import engine.utils.Vector3;

import static org.lwjgl.opengl.GL11.*;

public class Rectangle extends Component {
    Vector2 size = new Vector2(1,1);

    public void draw() {
        Vector3 position = Vector3.ZERO;
        Vector3 rotation = Vector3.ZERO;
        if (getNode().hasComponent(Transform.class)) {
            position = getNode().getComponent(Transform.class).position;
            rotation = getNode().getComponent(Transform.class).position;
        }

        glPushMatrix();

        glTranslatef(position.x, position.y, position.z);
        glRotatef(position.x, 0.0f, 0.0f, 0.0f);
        glScalef(size.x,size.y,0.0f);

        glBegin(GL_QUADS);

        glColor3f(1.0f, 0.0f, 0.0f);
        glVertex3f(-0.5f, -0.5f, 0.0f);

        glColor3f(0.0f, 1.0f, 0.0f);
        glVertex3f(0.5f, -0.5f, 0.0f);

        glColor3f(0.0f, 0.0f, 1.0f);
        glVertex3f(0.5f, 0.5f, 0.0f);

        glColor3f(1.0f, 1.0f, 0.0f);
        glVertex3f(-0.5f, 0.5f, 0.0f);

        glEnd(); // End drawing the rectangle

        glPopMatrix();
    }

    public Rectangle() {
        size = new Vector2(1,1);
    }

    public Rectangle(float width, float height) {
        size = new Vector2(width,height);
    }
}
