package com.dp.command;


class Receiver {

    private String os;

    public Receiver(String os) {
        this.os = os;
    }

    void action() {
        System.out.println(this.os + " execute copy action!");
    }
}