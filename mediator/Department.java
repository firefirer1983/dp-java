package com.dp.mediator;


abstract class Department {
    private Manager m;

    public Department(Manager m) {
        this.m = m;
    }

    abstract void selfJob();
    abstract void outSourceJob(String to);
}