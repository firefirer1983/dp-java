package com.dp.command;

class Command {
    public static void main(String[] args) {
        Invoker ivk = new Invoker(new CopyCommand());
        ivk.call();
    }
}