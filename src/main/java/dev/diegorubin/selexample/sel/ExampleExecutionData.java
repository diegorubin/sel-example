package dev.diegorubin.selexample.sel;

import lang.sel.interfaces.ExecutionData;

import dev.diegorubin.selexample.domain.Message;

public class ExampleExecutionData extends ExecutionData {

    private Message message;

    public ExampleExecutionData(Message message) {
        this.message = message;
    }

    public Message getMessage() {
        return message;
    }
}
