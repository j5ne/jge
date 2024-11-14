package engine.event;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Event {
    private List<Consumer<Object>> callbacks = new ArrayList<>();

    public void connect(Consumer<Object> callback) {
        callbacks.add(callback);
    }

    public void emit(Object... arguments) {
        for (Consumer<Object> callback : callbacks) {
            callback.accept(arguments);
        }
    }

}
