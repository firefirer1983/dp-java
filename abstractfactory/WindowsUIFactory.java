package abstractfactory;

class WindowsUIFactory implements UIFactory {

    public Button createButton() {
        return (Button)new WindowsButton();
    }

    public CheckBox createCheckBox() {
        return (CheckBox) new WindowsCheckBox();
    }
}