package engine.ecs.components;

import engine.utils.Vector3;

public class Transform extends Component {
    public Vector3 position = Vector3.ZERO;
    public Vector3 rotation = Vector3.ZERO;

    public Transform(Vector3 position) {
        this.position = position;
    }

    public Transform(float x, float y, float z) {
        this.position.x = x;
        this.position.y = y;
        this.position.z = z;
    }

    public Transform(int x, int y, int z) {
        this.position.x = (int) x;
        this.position.y = (int) y;
        this.position.z = (int) z;
    }

    public Transform(Vector3 position, Vector3 rotation) {
        this.position = position;
        this.rotation = rotation;
    }
}
