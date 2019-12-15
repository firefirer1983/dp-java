package memento;


class Memento {

    public static void main(String[] args) {
        CareTaker t = new CareTaker();

        Employee xy = new Employee("xy", 24, 3000);
        System.out.println(xy.getName() + ": age:" + xy.getAge() + " salary:" + xy.getSalary());
        EmployeeMemento m = xy.memento();
        xy.setAge(35);
        xy.setSalary(30000);
        System.out.println(xy.getName() + ": age:" + xy.getAge() + " salary:" + xy.getSalary());
        xy.recovery(m);
        System.out.println(xy.getName() + ": age:" + xy.getAge() + " salary:" + xy.getSalary());

    }
}