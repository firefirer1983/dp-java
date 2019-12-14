package com.dp.composite;

class ImageFile extends FileComponent {
    public ImageFile(String name) {
        super(name);
    }
    public void killVirus() {
        System.out.println("Image file " + name + " is cleaned!");
    }
}