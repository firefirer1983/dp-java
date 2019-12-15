package com.dp.state;


public interface RoomState {
    void checkin();
    void book();
    void checkout();
    void unbook();
}