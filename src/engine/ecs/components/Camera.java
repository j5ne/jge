package engine.ecs.components;

import engine.utils.Vector3;

public class Camera extends Component {

    private Vector3 position;
    private Vector3 rotation;
    public float fov;

    @Override
    public void draw() {

        if (getNode().hasComponent(Transform.class)) {
            Transform transform = getNode().getComponent(Transform.class);

            position = transform.position;
            rotation = transform.rotation;
        }

    }
}
