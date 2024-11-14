import engine.ecs.components.Camera;
import engine.ecs.components.Component;
import engine.ecs.components.Rectangle;
import engine.ecs.components.Transform;
import engine.game.Game;
import engine.input.InputManager;
import engine.nodes.Node;
import org.lwjgl.*;


public class Main extends Game {
    public void run() {
        System.out.println("Hello LWJGL " + Version.getVersion() + "!");

        init();

        Node newNode = new Node();
        newNode.addComponent(new Rectangle());
        newNode.addComponent(new Transform(0,0,0));

        getRoot().addChild(newNode);

        Node newNode2 = new Node();
        newNode2.addComponent(new Component());

        getRoot().addChild(newNode2);

        Rectangle component = getRoot().getComponent(Rectangle.class);

        Node camera = new Node();
        camera.addComponent(new Camera());

        loop();
    }

    public static void main(String[] args) {
        new Main().run();
    }

}