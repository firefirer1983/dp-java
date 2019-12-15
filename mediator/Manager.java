package mediator;
import java.util.HashMap;

class Manager {

    private HashMap<String, Department> deps = new HashMap<String, Department>();

    void register(String name, Department d) {
        if (! deps.containsKey(name)) {
            deps.put(name, d);
        }
    }

    void command(String name) {
        Department to = deps.get(name);
        to.selfJob();
    }
}