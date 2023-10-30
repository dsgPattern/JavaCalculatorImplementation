package org.example;

public class Main {
    public static void main(String[] args) {
        // currently Main is the Invoker

        Calculator calculator = new Calculator();// this is the Receiver
        AddCommand addCommand = new AddCommand(calculator, 12);// this is the Command
        addCommand.execute();

        // implement all other 3 methods
        // implement a command history stack, where you can undo last executed commands until there is none left

    }
}