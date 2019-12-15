package mediator;


class Market implements Department {
    private Manager manager;
    public Market(Manager m) {
        super();
        this.manager = m;
    }

    public void selfJob() {
        System.out.println("开拓市场!");
    }

    public void outSourceJob(String d) {
        manager.command(d);
    }
}