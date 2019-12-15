package com.dp.mediator;


class Mediator {
    public static void main(String[] args) {
        Manager m = new Manager();

        Development delp = new Development();
        Market market = new Market();
        Financial finan = new Financial();

        m.register(delp, "development");
        m.register(market, "market");
        m.register(finan, "financial");

        delp.selfJob();
        delp.outSourceJob("market");
    }
}