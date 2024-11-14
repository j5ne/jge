package engine.utils;

public class Rect2 {
    public Vector2 position = Vector2.ZERO;
    public Vector2 size = Vector2.ZERO;

    public Rect2(Vector2 position, Vector2 size) {
        this.position = position;
        this.size = size;
    }

    public static final Rect2 ZERO = new Rect2(Vector2.ZERO, Vector2.ZERO);
}
