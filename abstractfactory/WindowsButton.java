package com.dp.abstractfactory;


class WindowsButton implements Button {
    public WindowsButton() {
    }

    public void click() {
        System.out.println("Windows button clicked!");
    }
}