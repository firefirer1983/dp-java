package com.dp.mediator;


class Financial implements Department {
    public Financial(Manager m) {
        super(m);
    }

    public void selfJob() {
        System.out.println("数钱,发钱!");
    }

    public void outSourceJob(String d) {
        m.command(d);
    }
}