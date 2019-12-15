package abstractfactory;

class IOSUIFactory implements UIFactory {

    public Button createButton() {
        return (Button)new IOSButton();
    }

    public CheckBox createCheckBox() {
        return (CheckBox) new IOSCheckBox();
    }
}