package com.dp.command;
import java.util.ArrayList;
import java.util.List;

class PasteCommand implements ICommand {

    private List<Receiver> receivers = new ArrayList<Receiver>();

    public PasteCommand() {
        receivers.add(new Receiver("MAC"));
        receivers.add(new Receiver("Windows"));
        receivers.add(new Receiver("Ubuntu"));
    }

    public void execute() {
        for(Receiver r: receivers) {
            r.action("paste");
        }
    }
}