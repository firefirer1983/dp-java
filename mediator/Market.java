package com.dp.mediator;


class Market implements Department {
    public Market(Manager m) {
        super(m);
    }

    public void selfJob() {
        System.out.println("开拓市场!");
    }

    public void outSourceJob(String d) {
        m.command(d);
    }
}