package com.dp.proxy;


class Video {

    private String title;
    private int duration;
    private String artist;

    public Video(String artist, int duration, String title) {
        this.title = title;
        this.duration = duration;
        this.artist = artist;
    }

    public void play() {
        System.out.println("Video title: " + title + " duration: " + duration + "artist: " + artist);
    }
}