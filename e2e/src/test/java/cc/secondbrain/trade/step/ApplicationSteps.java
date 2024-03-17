package cc.secondbrain.trade.step;

import cc.secondbrain.trade.E2eApplication;
import com.github.leeonky.cucumber.restful.RestfulStep;
import com.github.leeonky.jfactory.JFactory;
import io.cucumber.java.Before;
import io.cucumber.spring.CucumberContextConfiguration;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootContextLoader;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = {E2eApplication.class}, loader = SpringBootContextLoader.class)
@CucumberContextConfiguration
public class ApplicationSteps {
    @Autowired
    JFactory jFactory;

    @Before(order = 1)
    public void clearDB() {
        jFactory.getDataRepository().clear();
    }

    @Autowired
    private RestfulStep restfulStep;

    @PostConstruct
    public void setBaseUrl() {
        restfulStep.setBaseUrl("http://127.0.0.1:3030");
    }
}

