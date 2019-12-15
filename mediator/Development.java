package mediator;


class Development implements Department {
    private Manager manager;
    public Development(Manager m) {
        super();
        this.manager = m;
    }

    public void selfJob() {
        System.out.println("开发中");
    }

    public void outSourceJob(String d) {
        manager.command(d);
    }
}