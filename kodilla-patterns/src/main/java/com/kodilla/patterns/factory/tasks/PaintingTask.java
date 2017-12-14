package com.kodilla.patterns.factory.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class PaintingTask implements Task {
    final String taskName;
    final String colour;
    final String whatToPaint;

    public PaintingTask(String taskName, String colour, String whatToPaint) {
        this.taskName = taskName;
        this.colour = colour;
        this.whatToPaint = whatToPaint;
    }

    public String getTaskName() {
        return taskName;
    }

    @Override
    public String executeTask() {
        return "Task "+ taskName+ " is executed. You need to paint on "+colour+" colour "+whatToPaint;
    }

    @Override
    public boolean isTaskExecuted() {
        List<String> whatToPaintList= new ArrayList<>(Arrays.asList("garage", "bedroom","kitchen"));
        if(whatToPaintList.contains(whatToPaint)){
            return true;
        }
        else{
            return false;
        }
    }
}

