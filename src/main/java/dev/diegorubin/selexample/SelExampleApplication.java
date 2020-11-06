package dev.diegorubin.selexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.beans.factory.annotation.Autowired;

import dev.diegorubin.selexample.sel.ExampleComponent;

@SpringBootApplication
public class SelExampleApplication implements CommandLineRunner {

    @Autowired
    private ExampleComponent component;


    public static void main(String[] args) {
        SpringApplication.run(SelExampleApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        component.execute();
    }

}
