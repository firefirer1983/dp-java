package bridge;

class StupidRemote implements Remote {
    protected Device device;
    public StupidRemote() {}
    public StupidRemote(Device device) {
        this.device = device;
    }

    public boolean volumnUp() {
        int vol = device.getVolumn();
        vol += 1;
        if (vol > 100) {
            vol = 100;
            return false;
        }
        device.setVolumn(vol);
        return true;
    }
    public boolean volumnDown() {
        int vol = device.getVolumn();
        vol -= 1;
        if (vol < 0) {
            vol = 0;
            return false;
        }
        device.setVolumn(vol);
        return true;
    }
    public boolean channelUp() {
        int ch = device.getChannel();
        ch += 1;
        if (ch > 200) {
            ch = 0;
            return false;
        }
        device.setChannel(ch);
        return true;

    }
    public boolean channelDown() {
        int ch = device.getChannel();
        ch -= 1;
        if (ch < 0) {
            ch = 0;
            return false;
        }
        device.setChannel(ch);
        return true;

    }

    public void getStatus() {
        device.getStatus();
    }
}