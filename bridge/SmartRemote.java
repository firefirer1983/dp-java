package com.dp.bridge;


class SmartRemote extends StupidRemote {
    private int unmuteVolumn = 0;
    public SmartRemote(Device device) {
        super(device);
        super.device = device;
        unmuteVolumn = device.getVolumn();
    }

    public void toggleMute() {
        int vol = device.getVolumn();
        if(vol == 0) {
            device.setVolumn(unmuteVolumn);
        } else {
            unmuteVolumn = device.getVolumn();
            device.setVolumn(0);
        }

    }
}