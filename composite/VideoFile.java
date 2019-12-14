package com.dp.composite;

class VideoFile extends FileComponent {
    public VideoFile(String name) {
        super(name);
    }
    public void killVirus() {
        System.out.println("Video file " + name + " is cleaned!");
    }
}