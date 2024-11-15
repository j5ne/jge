package engine.mesh;

import engine.utils.Vector2;
import engine.utils.Vector3;

import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.opengl.GL11.glPopMatrix;

public class Rectangle extends Mesh{
    public Vector2 size = Vector2.ZERO;

    public Rectangle(Vector2 size) {
        this.size = size;
    }

    @Override
    public void draw(Vector3 position, Vector3 rotation) {
        glPushMatrix();

        glTranslatef(position.x, position.y, position.z);
        glRotatef(rotation.x, 0.0f, 0.0f, 0.0f);
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
}
