package com.dp.strategy;
import java.util.HashMap;


class Context {
    private HashMap<String, IStrategy> strategies = new HashMap<String, IStrategy>();
    private HashMap<String, String> customerInfo = new HashMap<String, String>();
    private int thredshold = 500;

    public Context() {
        strategies.put("NewFew", new NewFewStrategy());
        strategies.put("NewMany", new NewManyStrategy());
        strategies.put("OldFew", new OldFewStrategy());
        strategies.put("OldMany", new OldManyStrategy());

        customerInfo.put("tom", "New");
        customerInfo.put("jack", "Old");
    }

    public double getDiscout(String name, int num) {
        String cusType = customerInfo.get(name);
        String strategyId;
        if(num > thredshold) {
            strategyId = cusType + "Many";
        } else {
            strategyId = cusType + "Few";
        }
        return strategies.get(strategyId).getPrice(6500);
    }

}