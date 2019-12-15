package com.dp.mediator;


class Mediator {
    public static void main(String[] args) {
        Manager m = new Manager();

        Development delp = new Development(m);
        Market market = new Market(m);
        Financial finan = new Financial(m);

        m.register("development", delp);
        m.register("market", market);
        m.register("financial", finan);

        delp.selfJob();
        delp.outSourceJob("financial");
    }
}