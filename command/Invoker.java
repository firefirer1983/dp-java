package com.dp.command;


class Invoker {
    private ICommand cmd;

    public Invoker(ICommand cmd) {
        this.cmd = cmd;
    }

    public void call() {
        cmd.execute();
    }
}