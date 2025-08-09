package com.example;

// Command interface
interface Command {
    void doIt();
}

// Receiver
class Task {
    public void doTask() {
        System.out.println("Do your home tasks");
    }
    public void dontTask() {
        System.out.println("Don't do your home tasks");
    }
}

// Concrete Command - DoTask
class DoTask implements Command {
    private Task task;

    public DoTask(Task task) { // Constructor fixed
        this.task = task;
    }

    @Override
    public void doIt() {
        this.task.doTask();
    }
}

// Concrete Command - DontDoTask
class DontDoTask implements Command {
    private Task task;

    public DontDoTask(Task task) { // Constructor fixed
        this.task = task;
    }

    @Override
    public void doIt() {
        this.task.dontTask();
    }
}

// Invoker
class Mom {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        this.command.doIt();
    }
}

// Client
public class Day25task05 {
    public static void main(String[] args) {
        System.out.println("Command Pattern - Behavioral DP");

        Task task = new Task();
        Mom remote = new Mom();

        Command onCommand = new DoTask(task);
        Command offCommand = new DontDoTask(task);

        remote.setCommand(onCommand);
        remote.executeCommand();

        remote.setCommand(offCommand);
        remote.executeCommand();
    }
}

