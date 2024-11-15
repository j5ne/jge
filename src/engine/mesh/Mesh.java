package engine.mesh;

import engine.utils.Vector3;

public abstract class Mesh {
    public void draw() {}

    public abstract void draw(Vector3 position, Vector3 rotation);
}
