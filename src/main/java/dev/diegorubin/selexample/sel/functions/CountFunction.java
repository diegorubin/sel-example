package dev.diegorubin.selexample.sel.functions;

import dev.diegorubin.selexample.domain.Message;
import dev.diegorubin.selexample.sel.ExampleExecutionData;

import lang.sel.annotations.Function;
import lang.sel.commons.results.IntegerResult;
import lang.sel.commons.results.TypedResult;
import lang.sel.interfaces.AbstractFunction;

@Function(value = "count", numberOfArguments = "0")
public class CountFunction extends AbstractFunction {

    public TypedResult execute(TypedResult... args) {
        Message message = ((ExampleExecutionData) executionData).getMessage();

        return new IntegerResult(Long.valueOf(message.getContent().length()));
    }

}
