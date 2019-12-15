package com.dp.command;


class Receiver {

    private String os;

    public Receiver(String os) {
        this.os = os;
    }

    void action(String act) {
        System.out.println(this.os + " execute " + act + "action!");
    }
}