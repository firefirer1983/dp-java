package com.dp.composite;


abstract class FileComponent {
    protected String name;

    public FileComponent(String name) {
        this.name = name;
    }

    abstract void killVirus();
}