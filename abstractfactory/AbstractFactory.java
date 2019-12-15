package abstractfactory;


class AbstractFactory {
    public static void main(String[] args) {
        String osType = "Win";
        UIFactory fac = null;
        if(osType.equals("IOS")) {
            fac = new IOSUIFactory();
        } else if (osType.equals("Win")) {
            fac = new WindowsUIFactory();
        }

        Button btn = fac.createButton();
        CheckBox ckb = fac.createCheckBox();

        btn.click();
        ckb.check();
    }
}