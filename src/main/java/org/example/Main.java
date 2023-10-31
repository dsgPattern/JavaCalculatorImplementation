package org.example;

public class Main {
    public static void main(String[] args) {
        // currently Main is the Invoker

        Calculator calculator = new Calculator();// this is the Receiver
        AddCommand addCommand = new AddCommand(calculator, 12);// this is the Command
        addCommand.execute();



        // 1+1=2
        // 2*3 = 6
        // 6-2 = 4
        // undo
        // 4+2 = 6
        // undo
        // 6/3 = 2

        // implement all other 3 methods
        // implement a command history stack, where you can undo last executed commands until there is none left
        // at the same time you can also redo commands
        // this should work exactly like in a text editor, where you can Undo and Redo sequentially until the beginning or end

    }
}