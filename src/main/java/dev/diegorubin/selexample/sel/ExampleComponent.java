package dev.diegorubin.selexample.sel;

import lang.sel.core.SelContext;
import lang.sel.core.SelParser;
import lang.sel.commons.results.BooleanResult;

import dev.diegorubin.selexample.domain.Message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ExampleComponent {

    @Autowired
    private SelContext selContext;

    public void execute() {

        String code = "count() EQ 5";
        Message message = new Message();
        message.setContent("teste");

        ExampleExecutionData executionData = new ExampleExecutionData(message);
        SelParser parser = new SelParser(code, selContext, executionData);
        BooleanResult result = (BooleanResult) parser.evaluate();
        System.out.println("\n\n\n-----");
        System.out.println(result.getResult());
        System.out.println("-----\n\n\n");
    }
}
