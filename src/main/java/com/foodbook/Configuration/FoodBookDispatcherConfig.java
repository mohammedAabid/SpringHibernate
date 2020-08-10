package com.foodbook.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import java.util.Properties;
import javax.sql.DataSource;
import org.hibernate.SessionFactory;



@Configuration
@EnableTransactionManagement 
@ComponentScan(basePackages = "com.foodbook.Controllers,com.foodbook.Service,com.foodbook.DAO")
@PropertySource(value = { "classpath:application.properties" })
public class FoodBookDispatcherConfig {

	@Bean
	public InternalResourceViewResolver loginResolver() {
		System.out.println("internal resources");
		InternalResourceViewResolver loginResolver = new InternalResourceViewResolver();
		loginResolver.setPrefix("WEB-INF/view/");
		loginResolver.setSuffix(".jsp");
		return loginResolver;
	}
	@Autowired
    private Environment environment;
 
    @Bean
    public LocalSessionFactoryBean sessionFactory() throws Exception{
    	System.out.println("in LocalSessionFactoryBean ");
        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
        sessionFactory.setDataSource(dataSource());
       // sessionFactory.setPackagesToScan(new String[] { "com.food.DTO" });
       sessionFactory.setHibernateProperties(hibernateProperties());
       System.out.println(sessionFactory);
        return sessionFactory;
     }
     
    @Bean
    public DataSource dataSource() throws Exception {
    	System.out.println("dataSource ");
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(environment.getRequiredProperty("jdbc.driverClassName"));
        dataSource.setUrl(environment.getRequiredProperty("jdbc.url"));
        dataSource.setUsername(environment.getRequiredProperty("jdbc.username"));
        dataSource.setPassword(environment.getRequiredProperty("jdbc.password"));
        System.out.println(environment.getRequiredProperty("jdbc.username"));
        System.out.println(environment.getRequiredProperty("jdbc.driverClassName"));
    System.out.println( environment.getRequiredProperty("jdbc.url"));
    //System.out.println(dataSource.getConnection());
        
        return dataSource;
    }
     
    
    private Properties hibernateProperties() {
        Properties properties = new Properties();
        properties.put("hibernate.dialect", environment.getRequiredProperty("hibernate.dialect"));
        properties.put("hibernate.show_sql", environment.getRequiredProperty("hibernate.show_sql"));
        properties.put("hibernate.format_sql", environment.getRequiredProperty("hibernate.format_sql"));
        properties.put("hibernate.show_sql", environment.getRequiredProperty("hibernate.show_sql"));
        properties.put("hibernate.hbm2ddl.auto", environment.getRequiredProperty("hibernate.hbm2ddl.auto"));
        
        
        return properties;        
    }
     
    @Bean
    //@Autowired
    public HibernateTransactionManager transactionManager(SessionFactory s) {
       HibernateTransactionManager txManager = new HibernateTransactionManager();
       txManager.setSessionFactory(s);
       return txManager;
    }

}
