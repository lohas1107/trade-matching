package cc.secondbrain.trade.config;

import cc.secondbrain.trade.factory.EntityFactory;
import com.github.leeonky.jfactory.JFactory;
import com.github.leeonky.jfactory.repo.JPADataRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

@Configuration
public class FactoryConfiguration {

    @PersistenceUnit
    private EntityManagerFactory entityManagerFactory;

    @Bean
    public JFactory factorySet() {
        return new EntityFactory(new JPADataRepository(entityManagerFactory.createEntityManager()));
    }

}