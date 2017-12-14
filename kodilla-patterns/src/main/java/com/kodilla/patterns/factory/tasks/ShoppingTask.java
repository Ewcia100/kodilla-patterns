package com.kodilla.patterns.factory.tasks;

import java.util.*;

public final class ShoppingTask implements Task {
    final String taskName;
    final String whatToBuy;
    final double quantity;

    public ShoppingTask(final String taskName, final String whatToBuy, final double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public String executeTask() {
        return "Task " + taskName + " is executed. You need buy " + quantity +" "+ whatToBuy;
    }

    public boolean isTaskExecuted() {
        Map<String, Double> productsList = new HashMap<>();
        productsList.put("apples", 10.0);
        productsList.put("carrots", 2.0);
        productsList.put("onions", 8.0);
        productsList.put("flour", 3.0);


        for (Map.Entry<String, Double> entry : productsList.entrySet()) {
            if (entry.getKey().equals(whatToBuy)) {
                double howMany = entry.getValue();
                if (howMany == quantity) {
                    return true;
                }
            }

        }
        return false;
    }
}

