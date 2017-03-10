package learn.partOne.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.persistenceunit.PersistenceUnitManager;
import org.springframework.orm.jpa.vendor.AbstractJpaVendorAdapter;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.persistence.EntityManager;
import javax.sql.DataSource;
import java.util.Map;

/**
 * Created by clz on 2017/2/2.
 */
@Configuration
@EnableTransactionManagement
@ComponentScan(basePackages = {"learn.partTwo.springMVC.dataSource"})
@EnableJpaRepositories(
        basePackages = {"learn.partOne.jpaRepositorySecond"},
        entityManagerFactoryRef = "entityManagerFactorySecond",
        transactionManagerRef = "transactionManagerSecond")
public class JpaConfigSecond {
    @Autowired
    @Qualifier("secondDS")
    private DataSource dataSource;

    @Primary
    @Bean(name = "entityManagerFactorySecond")
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryPrimary(JpaProperties jpaProperties) {
        EntityManagerFactoryBuilder builder = createEntityManagerFactoryBuilder(jpaProperties);
        return builder
                .dataSource(dataSource)
                .properties(getVendorProperties(dataSource))
                .packages("learn.partOne.model")
                .persistenceUnit("secondPersistenceUnit")
                .build();
    }

    @Primary
    @Bean(name = "entityManagerSecond")
    public EntityManager entityManager(JpaProperties jpaProperties) {
        return entityManagerFactoryPrimary(jpaProperties).getObject().createEntityManager();
    }

    @Primary
    @Bean(name = "transactionManagerSecond")
    PlatformTransactionManager transactionManagerPrimary(JpaProperties jpaProperties) {
        return new JpaTransactionManager(entityManagerFactoryPrimary(jpaProperties).getObject());
    }
    private EntityManagerFactoryBuilder createEntityManagerFactoryBuilder(
            JpaProperties testerJpaProperties) {
        JpaVendorAdapter jpaVendorAdapter = createJpaVendorAdapter(testerJpaProperties);
        return new EntityManagerFactoryBuilder(jpaVendorAdapter, getVendorProperties(dataSource),
                this.persistenceUnitManager);
    }
    @Bean
    public JpaProperties testerJpaProperties() {
        JpaProperties jpaProperties = new JpaProperties();
        JpaProperties.Hibernate hibernate = new JpaProperties.Hibernate();
        jpaProperties.setHibernate(hibernate);
        return jpaProperties;
    }
    public JpaVendorAdapter createJpaVendorAdapter(JpaProperties testerJpaProperties) {
        AbstractJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
        adapter.setShowSql(testerJpaProperties.isShowSql());
        adapter.setDatabase(testerJpaProperties.getDatabase());
        adapter.setDatabasePlatform(testerJpaProperties.getDatabasePlatform());
        adapter.setGenerateDdl(testerJpaProperties.isGenerateDdl());
        return adapter;
    }
    @Autowired(required = false)
    public PersistenceUnitManager persistenceUnitManager;

    public Map<String, String> getVendorProperties(DataSource dataSource) {
        return testerJpaProperties().getHibernateProperties(dataSource);
    }

}
