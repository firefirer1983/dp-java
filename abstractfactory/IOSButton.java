package com.dp.abstractfactory;

class IOSButton implements Button {

    public IOSButton() {
    }

    public void click() {
        System.out.println("IOS Button Clicked!");
    }
}