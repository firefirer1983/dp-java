package state;


public interface RoomState {
    void checkin();
    void book();
    void checkout();
    void unbook();
}