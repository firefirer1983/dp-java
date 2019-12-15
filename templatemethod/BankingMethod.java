package templatemethod;


abstract class BankingMethod {

    private void queue() {
        System.out.println("排队取号");
    }

    private void evaluate() {
        System.out.println("评价服务");
    }

    abstract public void transaction();

    void process() {
        queue();
        transaction();
        evaluate();
    }
}