package templatemethod;


class Withdraw extends BankingMethod {
    public void transaction() {
        System.out.println("我要取款");
        System.out.println("取款成功");
    }
}

class Deposit extends BankingMethod {
    public void transaction() {
        System.out.println("我要存钱");
        System.out.println("存钱成功");
    }
}

class Finance extends BankingMethod {
    public void transaction() {
        System.out.println("我要理财");
        System.out.println("理财成功");
    }
}

class TemplateMethod {
    public static void main(String[] args) {
        new Withdraw().process();
        new Deposit().process();
        new Finance().process();
    }
}
