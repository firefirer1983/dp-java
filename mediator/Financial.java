package mediator;


class Financial implements Department {
    private Manager manager;
    public Financial(Manager m) {
        super();
        this.manager = m;
    }

    public void selfJob() {
        System.out.println("数钱,发钱!");
    }

    public void outSourceJob(String d) {
        manager.command(d);
    }
}