package com.dp.bridge;


class TVDevice implements Device {
    private int volumn = 0;
    private int channel = 0;
    public TVDevice() {
    }
    public int getVolumn() {
        return volumn;
    }

    public boolean setVolumn(int vol) {
        volumn = vol;
        return true;
    }
    public int getChannel() {
        return channel;
    }
    public boolean setChannel(int ch) {
        channel = ch;
        return true;
    }
    public void getStatus() {
        System.out.println("TV current status: ");
        System.out.println("volumn: " + volumn);
        System.out.println("channel: " + channel);
    }
}