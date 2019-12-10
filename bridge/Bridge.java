package com.dp.bridge;


class Bridge {
    public static void main(String[] args) {
        Device tv = new TVDevice();
        Remote stupid = new StupidRemote(tv);
        SmartRemote smart = new SmartRemote(tv);

        stupid.getStatus();
        stupid.volumnUp();
        stupid.channelUp();
        stupid.getStatus();

        smart.getStatus();
        smart.volumnUp();
        smart.channelUp();
        smart.getStatus();

        smart.toggleMute();
        smart.getStatus();
        smart.toggleMute();
        smart.getStatus();
    }
}