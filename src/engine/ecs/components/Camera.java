package engine.ecs.components;

import engine.utils.Vector3;


public class Camera extends Component {
    public enum CameraMode {
        ORTHOGONAL,
        PERSPECTIVE
    }

    private Vector3 position = Vector3.ZERO;
    private Vector3 rotation;
    public float fov = 90;

    public CameraMode cameraMode = CameraMode.PERSPECTIVE;

    @Override
    public void draw() {

        if (getNode().hasComponent(Transform.class)) {
            Transform transform = getNode().getComponent(Transform.class);

            position = transform.position;
            rotation = transform.rotation;
        }

    }
}
