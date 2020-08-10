package com.foodbook.DBConfigSettings;



import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtility {
	private static StandardServiceRegistry registry;
	private static SessionFactory sessionFactory;
//@Transactional(dontRollbackOn =Exception.class)
	public static SessionFactory buildSessionFactory() {

		try {
			if (sessionFactory == null) {
				// Create the SessionFactory from hibernate.cfg.xml
				Configuration configuration = new Configuration();
				configuration.configure("hibernate.cfg.xml");
				System.out.println("Hibernate Configuration loaded");
				registry = new StandardServiceRegistryBuilder().configure().build();
				System.out.println("Hibernate serviceRegistry created");
				MetadataSources metadatasources = new MetadataSources(registry);
				Metadata metadata = metadatasources.getMetadataBuilder().build();
				sessionFactory = metadata.getSessionFactoryBuilder().build();
				System.out.println("session factory");
			}
		}

		catch (Exception ex) {
			// TODO: handle exception
			System.err.println("Initial SessionFactory creation failed." + ex);
			ex.printStackTrace();
			throw new ExceptionInInitializerError(ex);

		}
		return sessionFactory;
	}

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null)
			sessionFactory = buildSessionFactory();
		return sessionFactory;
	}

	public static void shutdown() {
		if (registry != null) {
			StandardServiceRegistryBuilder.destroy(registry);
			buildSessionFactory().close();
		}

	}
}
