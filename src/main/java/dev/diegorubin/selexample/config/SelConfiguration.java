package dev.diegorubin.selexample.config;

import lang.sel.core.SelContext;
import lang.sel.springboot.SelLoader;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SelConfiguration {

    @Bean
    public SelContext selContext() {
        SelLoader selLoader = new SelLoader();
        SelContext selContext = new SelContext();
        selLoader.load(selContext, "dev.diegorubin.selexample");
        return selContext;
    }

}
