package com.dp.state;

class State {
    public static void main(String[] args) {
        System.out.println("Room service!");
        Room room = new Room(301);
        room.book();
        room.checkin();
        room.checkout();
    }
}