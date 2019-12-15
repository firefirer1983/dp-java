package memento;


import java.util.HashMap;


class CareTaker {

    HashMap<String, EmployeeMemento> mementos = new HashMap<String, EmployeeMemento>();

    public void addMemento(String name, EmployeeMemento mem) {
        mementos.put(name, mem);
    }

    public EmployeeMemento getMemento(String name) {
        return mementos.get(name);
    }

}