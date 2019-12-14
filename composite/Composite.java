package com.dp.composite;


class Composite {
    public static void main(String[] args) {
        ImageFile img1 = new ImageFile("girls.jpg");
        ImageFile img2 = new ImageFile("boys.jpg");

        Directory d1 = new Directory("picture box");
        d1.addFile(img1);
        d1.addFile(img2);

        Directory d2 = new Directory("video box");
        d1.addFile(d2);

        d2.addFile(new VideoFile("animal.avi"));
        d1.killVirus();
    }
}