package com.dp.command;
import java.util.List;
import java.util.ArrayList;


class Invoker {
    private List<ICommand> cmdList = new ArrayList<ICommand>();

    public Invoker() {
    }

    public void execute(ICommand cmd) {
        cmdList.add(cmd);
    }

    public void commit() {
        for(ICommand command: cmdList) {
            command.execute();
        }
    }
}