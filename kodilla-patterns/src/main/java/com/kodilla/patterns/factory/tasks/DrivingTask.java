package com.kodilla.patterns.factory.tasks;

public final class DrivingTask implements Task {
    final String taskName;
    final String where;
    final String using;

    public DrivingTask(final String taskName, final String where, final String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    public String getTaskName() {
        return taskName;
    }

    @Override
    public String executeTask() {
        return "Task " + taskName + " is executed. You need go by " + using + " to " + where;
    }

    @Override
    public boolean isTaskExecuted() {
        if (where == "Warsaw" && using == "car") {
            return true;
        } else {
            return false;
        }
    }
}
