package engine.input;
import engine.event.Event;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWKeyCallbackI;

import static org.lwjgl.glfw.GLFW.*;

public class InputManager {
    enum inputType {
        KEYBOARD,
        MOUSE
    }

    public static InputMap inputMap = new InputMap();
    public static long window;

    private static final GLFWKeyCallbackI keyHandler = (long window, int key, int scancode, int action, int mods) -> {
        if (action == GLFW_PRESS) {
            System.out.println("Key pressed: " + key);
        }
    };

    public static void init() {
        System.out.println("INIT");
        glfwSetKeyCallback(window, keyHandler);

        Event event = new Event();
        event.connect((_) -> {
            System.out.println("test");
        });

        event.emit();
        event.emit();
    }

    public static void getActionPressedEvent(String action) {

    }
}
