package cc.secondbrain.trade.config;

import cc.secondbrain.trade.TradeApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootContextLoader;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = {TradeApplication.class}, loader = SpringBootContextLoader.class)
@CucumberContextConfiguration
public class CucumberConfiguration {
}

