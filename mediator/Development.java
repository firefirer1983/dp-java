package com.dp.mediator;


class Development implements Department {
    public Development(Manager m) {
        super(m);
    }

    public void selfJob() {
        System.out.println("开发中");
    }

    public void outSourceJob(String d) {
        m.command(d);
    }
}